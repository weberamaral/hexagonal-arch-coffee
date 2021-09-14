package com.github.weberamaral.coffeeapi.coffee.usecase;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.common.model.UseCase;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class CreateCoffee implements UseCase {
  private final String name;
  private final BrewingMethod method;
  private final CoffeeSize size;
  private final CoffeeType type;
}
