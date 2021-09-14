package com.github.weberamaral.coffeeapi.coffee.event;

import com.github.weberamaral.coffeeapi.common.model.Event;
import com.github.weberamaral.coffeeapi.order.model.CoffeeOrder;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CoffeeCreatedEvent implements Event {
  private String id;
  private String customerName;
  private LocalDateTime createdAt;
  private String coffeeOrder;
  private String status;
  
  public static CoffeeCreatedEvent from(CoffeeOrder coffeeOrder) {
    return CoffeeCreatedEvent.builder()
      .id(coffeeOrder.getId().toString())
      .customerName(coffeeOrder.getCustomerName())
      .createdAt(LocalDateTime.now())
      .coffeeOrder(coffeeOrder.toString())
      .status(coffeeOrder.getStatus().name())
      .build();
  }
}
