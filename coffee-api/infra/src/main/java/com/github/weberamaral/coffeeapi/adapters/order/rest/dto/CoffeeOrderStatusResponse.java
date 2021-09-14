package com.github.weberamaral.coffeeapi.adapters.order.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
@Builder
public class CoffeeOrderStatusResponse {
  private String status;
}
