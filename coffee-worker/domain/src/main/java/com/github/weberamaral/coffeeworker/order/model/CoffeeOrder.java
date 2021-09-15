package com.github.weberamaral.coffeeworker.order.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class CoffeeOrder {
  private String id;
  private String customerName;
  private String status;
}
