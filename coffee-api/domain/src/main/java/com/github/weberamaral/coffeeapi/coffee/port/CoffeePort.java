package com.github.weberamaral.coffeeapi.coffee.port;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;

import java.util.List;

public interface CoffeePort {
  List<Coffee> all();
  Coffee create(Coffee coffee);
}
