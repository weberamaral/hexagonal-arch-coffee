package com.github.weberamaral.coffeeapi.coffee.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Builder
@Getter
public class Coffee {
  private final UUID id;
  private final String name;
  private final BrewingMethod method;
  private final CoffeeType type;
  private final CoffeeSize size;
}
