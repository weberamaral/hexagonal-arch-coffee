package com.github.weberamaral.coffeeworker.order.port;

import com.github.weberamaral.coffeeworker.order.model.CoffeeOrder;

public interface CoffeeOrderPort {
  void persist(CoffeeOrder coffeeOrder);
}
