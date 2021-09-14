package com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.coffee.usecase.CreateCoffee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeCreateRequest {
  private String name;
  private String method;
  private String size;
  private String type;
  
  public CreateCoffee toUseCase() {
    return CreateCoffee.builder()
      .name(this.getName())
      .method(BrewingMethod.builder().method(this.getMethod()).build())
      .size(CoffeeSize.builder().size(this.getSize()).build())
      .type(CoffeeType.builder().type(this.getType()).build())
      .build();
  }
}
