package com.github.weberamaral.coffeeapi.adapters.coffee.rest;

import com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto.CoffeeCreateRequest;
import com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto.CoffeeResponse;
import com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto.CreateCoffeeResponse;
import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.usecase.CreateCoffee;
import com.github.weberamaral.coffeeapi.common.rest.BaseController;
import com.github.weberamaral.coffeeapi.common.rest.DataResponse;
import com.github.weberamaral.coffeeapi.common.rest.Response;
import com.github.weberamaral.coffeeapi.common.usecase.EmptyUseCaseHandler;
import com.github.weberamaral.coffeeapi.common.usecase.UseCaseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/coffee")
public class CoffeeController extends BaseController {
  
  private final UseCaseHandler<Coffee, CreateCoffee> createCoffeeUseCaseHandler;
  private final EmptyUseCaseHandler<List<Coffee>> allCoffeesUseCaseHandler;
  
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Response<DataResponse<CoffeeResponse>> all() {
    var coffees = allCoffeesUseCaseHandler.handle();
    var coffeesResponse = coffees.stream().map(CoffeeResponse::fromModel).collect(Collectors.toList());
    
    return respond(coffeesResponse);
  }
  
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Response<CreateCoffeeResponse> create(@RequestBody CoffeeCreateRequest request) {
    var coffee = createCoffeeUseCaseHandler.handle(request.toUseCase());
    var response = CreateCoffeeResponse.builder()
      .id(coffee.getId().toString())
      .build();
    
    return respond(response);
  }
}
