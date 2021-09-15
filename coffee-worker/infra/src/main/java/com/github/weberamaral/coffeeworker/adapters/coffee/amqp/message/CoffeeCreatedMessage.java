package com.github.weberamaral.coffeeworker.adapters.coffee.amqp.message;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.github.weberamaral.coffeeworker.order.model.CoffeeOrder;
import com.github.weberamaral.coffeeworker.order.model.OrderStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class CoffeeCreatedMessage {
  
  private String id;
  private String customerName;
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  private LocalDateTime createdAt;
  private String coffeeBrewingMethod;
  private String coffeeType;
  private String coffeeSize;
  private String coffeeName;
  private String status;
  
  public CoffeeOrder toModel() {
    return CoffeeOrder.builder()
      .id(UUID.fromString(this.getId()))
      .customerName(this.getCustomerName())
      .brewingMethod(this.getCoffeeBrewingMethod())
      .coffeeType(this.getCoffeeType())
      .coffeeSize(this.getCoffeeSize())
      .coffeeName(this.getCoffeeName())
      .status(OrderStatus.valueOf(this.getStatus()))
      .build();
  }
}
