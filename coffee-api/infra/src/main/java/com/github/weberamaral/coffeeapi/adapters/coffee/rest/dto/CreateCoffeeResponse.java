package com.github.weberamaral.coffeeapi.adapters.coffee.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class CreateCoffeeResponse {
  private final String id;
}
