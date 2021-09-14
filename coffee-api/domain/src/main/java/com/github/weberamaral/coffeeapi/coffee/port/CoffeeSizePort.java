package com.github.weberamaral.coffeeapi.coffee.port;

import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;

import java.util.List;

public interface CoffeeSizePort {
  List<CoffeeSize> all();
}
