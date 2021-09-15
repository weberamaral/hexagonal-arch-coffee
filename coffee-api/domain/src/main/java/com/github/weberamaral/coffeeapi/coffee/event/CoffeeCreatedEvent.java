package com.github.weberamaral.coffeeapi.coffee.event;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.common.model.Event;
import com.github.weberamaral.coffeeapi.order.model.CoffeeOrder;
import lombok.*; 

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeCreatedEvent implements Event {
  private String id;
  private String customerName;
  private LocalDateTime createdAt;
  private String status;
  private Coffee coffee;
  
  public static CoffeeCreatedEvent from(CoffeeOrder coffeeOrder) {
    return CoffeeCreatedEvent.builder()
      .id(coffeeOrder.getId().toString())
      .customerName(coffeeOrder.getCustomerName())
      .createdAt(LocalDateTime.now())
      .coffee(coffeeOrder.getCoffee())
      .status(coffeeOrder.getStatus().name())
      .build();
  }
}
