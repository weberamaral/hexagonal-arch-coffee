package com.github.weberamaral.coffeeworker.common.event;

import com.github.weberamaral.coffeeworker.common.model.Event;

public interface EventPublisher<T extends Event> {
  void publish(T event);
}
