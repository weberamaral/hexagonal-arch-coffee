package com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoffeeResponse {
  private String id;
  private String name;
  private String type;
  private String size;
  private String method;
  
  public static CoffeeResponse fromModel(Coffee coffee) {
    return CoffeeResponse.builder()
      .id(coffee.getId().toString())
      .name(coffee.getName())
      .type(coffee.getType().getType())
      .size(coffee.getSize().getSize())
      .method(coffee.getMethod().getMethod())
      .build();
  }
}
