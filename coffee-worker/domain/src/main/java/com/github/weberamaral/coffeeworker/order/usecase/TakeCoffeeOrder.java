package com.github.weberamaral.coffeeworker.order.usecase;

import com.github.weberamaral.coffeeworker.common.model.UseCase;
import com.github.weberamaral.coffeeworker.order.model.CoffeeOrder;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class TakeCoffeeOrder implements UseCase {
  private final CoffeeOrder coffeeOrder;
}
