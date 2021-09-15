package com.github.weberamaral.coffeeapi.adapters.order.amqp.message;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.github.weberamaral.coffeeapi.coffee.event.CoffeeCreatedEvent;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class CoffeeCreatedMessage {
  
  private String id;
  
  private String customerName;
  
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime createdAt;
  
  private String coffeeBrewingMethod;
  
  private String coffeeType;
  
  private String coffeeSize;
  
  private String coffeeName;
  
  private String status;
  
  public static CoffeeCreatedMessage from(CoffeeCreatedEvent event) {
    return CoffeeCreatedMessage.builder()
      .id(event.getId())
      .customerName(event.getCustomerName())
      .createdAt(event.getCreatedAt())
      .coffeeBrewingMethod(event.getCoffee().getMethod().getMethod())
      .coffeeType(event.getCoffee().getType().getType())
      .coffeeSize(event.getCoffee().getSize().getSize())
      .coffeeName(event.getCoffee().getName())
      .status(event.getStatus())
      .build();
  }
}
