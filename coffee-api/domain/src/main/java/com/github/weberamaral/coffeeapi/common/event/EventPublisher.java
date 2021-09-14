package com.github.weberamaral.coffeeapi.common.event;

import com.github.weberamaral.coffeeapi.common.model.Event;

public interface EventPublisher<T extends Event> {
  void publish(T event);
}
