package com.github.weberamaral.coffeeapi.coffee.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Builder
@Getter
public class BrewingMethod {
  private final UUID id;
  private final String method;
}
