package com.github.weberamaral.coffeeapi.order.usecase;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.common.model.UseCase;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class CreateCoffeeOrder implements UseCase {
  private String customerName;
  private Coffee coffee;
}
