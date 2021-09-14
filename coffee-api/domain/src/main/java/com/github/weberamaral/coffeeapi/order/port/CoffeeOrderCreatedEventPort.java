package com.github.weberamaral.coffeeapi.order.port;

import com.github.weberamaral.coffeeapi.coffee.event.CoffeeCreatedEvent;
import com.github.weberamaral.coffeeapi.common.event.EventPublisher;

public interface CoffeeOrderCreatedEventPort extends EventPublisher<CoffeeCreatedEvent> {
  void publish(CoffeeCreatedEvent coffeeCreatedEvent);
}
