package com.github.weberamaral.coffeeapi.coffee.port;

import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;

import java.util.List;

public interface CoffeeTypePort {
  List<CoffeeType> all();
}
