package com.github.weberamaral.coffeeapi.order.model;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import lombok.*;

import java.util.UUID;

@Data
@Getter
@Builder
public class CoffeeOrder {
  private final UUID id;
  private final String customerName;
  private final Coffee coffee;
  private final OrderStatus status;
}
