package com.github.weberamaral.coffeeapi.adapters.order.rest;

import com.github.weberamaral.coffeeapi.adapters.order.rest.dto.CoffeeOrderCreateRequest;
import com.github.weberamaral.coffeeapi.adapters.order.rest.dto.CoffeeOrderCreateResponse;
import com.github.weberamaral.coffeeapi.adapters.order.rest.dto.CoffeeOrderStatusResponse;
import com.github.weberamaral.coffeeapi.common.rest.BaseController;
import com.github.weberamaral.coffeeapi.common.rest.Response;
import com.github.weberamaral.coffeeapi.common.usecase.UseCaseHandler;
import com.github.weberamaral.coffeeapi.order.model.CoffeeOrder;
import com.github.weberamaral.coffeeapi.order.model.OrderStatus;
import com.github.weberamaral.coffeeapi.order.usecase.CheckOrderStatus;
import com.github.weberamaral.coffeeapi.order.usecase.CreateCoffeeOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/coffee")
public class CoffeeOrderController extends BaseController {
  
  private final UseCaseHandler<CoffeeOrder, CreateCoffeeOrder> createCoffeeOrderUseCaseHandler;
  private final UseCaseHandler<OrderStatus, CheckOrderStatus> checkStatusUseCaseHandler;
  
  @GetMapping("/{id}/status")
  public Response<CoffeeOrderStatusResponse> status(@PathVariable String id, HttpServletResponse response) {
    var status = checkStatusUseCaseHandler.handle(CheckOrderStatus.builder().orderId(UUID.fromString(id)).build());
    response.setStatus(get(status).value());
    
    return respond(CoffeeOrderStatusResponse.builder().status(status.toString()).build());
  }
  
  @PostMapping("/make")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public Response<CoffeeOrderCreateResponse> make(@RequestBody CoffeeOrderCreateRequest request) {
    var order = createCoffeeOrderUseCaseHandler.handle(request.toUseCase());
    var response = CoffeeOrderCreateResponse.builder()
      .id(order.getId().toString())
      .build();
    
    return respond(response);
  }
  
  private HttpStatus get(OrderStatus orderStatus) {
    switch (orderStatus) {
      case PENDING:
        return HttpStatus.ACCEPTED;
      case NOT_FOUND:
        return HttpStatus.NOT_FOUND;
      default:
        return HttpStatus.OK;
    }
  }
}
