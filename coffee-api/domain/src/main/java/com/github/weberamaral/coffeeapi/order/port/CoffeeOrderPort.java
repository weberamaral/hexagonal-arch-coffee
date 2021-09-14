package com.github.weberamaral.coffeeapi.order.port;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.order.model.CoffeeOrder;
import com.github.weberamaral.coffeeapi.order.model.OrderStatus;

import java.util.UUID;

public interface CoffeeOrderPort {
  OrderStatus status(UUID coffeeOrderId);
}
