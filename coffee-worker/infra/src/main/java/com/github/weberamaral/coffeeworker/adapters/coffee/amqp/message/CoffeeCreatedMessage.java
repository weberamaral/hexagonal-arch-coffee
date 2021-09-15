package com.github.weberamaral.coffeeworker.adapters.coffee.amqp.message;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;
import org.apache.tomcat.jni.Local;

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
}
