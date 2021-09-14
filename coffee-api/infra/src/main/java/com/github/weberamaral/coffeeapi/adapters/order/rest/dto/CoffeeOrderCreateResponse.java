package com.github.weberamaral.coffeeapi.adapters.order.rest.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class CoffeeOrderCreateResponse {
  private String id;
}
