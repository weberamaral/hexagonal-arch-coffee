package com.github.weberamaral.coffeeworker.order.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Builder
@Getter
public class CoffeeOrder {
  private final UUID id;
  private final String customerName;
  private final String coffeeType;
  private final String coffeeSize;
  private final String coffeeName;
  private final String brewingMethod;
  private OrderStatus status;
}
