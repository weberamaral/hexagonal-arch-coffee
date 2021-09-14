package com.github.weberamaral.coffeeapi.adapters.order.redis;

import com.github.weberamaral.coffeeapi.order.model.OrderStatus;
import com.github.weberamaral.coffeeapi.order.port.CoffeeOrderPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CheckStatusRedisFakeAdapter implements CoffeeOrderPort {
  
  @Override
  public OrderStatus status(UUID coffeeOrderId) {
    if (!coffeeOrderId.toString().equals("8caa191e-c7ce-4133-adb5-2d9059251cc8")) {
      return OrderStatus.NOT_FOUND;
    }
    return OrderStatus.PENDING;
  }
}
