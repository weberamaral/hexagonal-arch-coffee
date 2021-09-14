package com.github.weberamaral.coffeeapi.adapters.order.rest.dto;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.order.usecase.CreateCoffeeOrder;
import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrderCreateRequest {
  private String customerName;
  private String coffeeName;
  private String method;
  private String type;
  private String size;
  
  public CreateCoffeeOrder toUseCase() {
    var coffee = Coffee.builder()
      .name(this.getCoffeeName())
      .size(CoffeeSize.builder().size(this.getSize()).build())
      .type(CoffeeType.builder().type(this.getType()).build())
      .method(BrewingMethod.builder().method(this.getMethod()).build())
      .build();
    
    return CreateCoffeeOrder.builder()
      .customerName(this.getCustomerName())
      .coffee(coffee)
      .build();
  }
}
