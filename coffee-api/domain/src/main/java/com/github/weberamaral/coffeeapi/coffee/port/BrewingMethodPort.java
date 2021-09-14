package com.github.weberamaral.coffeeapi.coffee.port;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;

import java.util.List;

public interface BrewingMethodPort {
  List<BrewingMethod> all();
}
