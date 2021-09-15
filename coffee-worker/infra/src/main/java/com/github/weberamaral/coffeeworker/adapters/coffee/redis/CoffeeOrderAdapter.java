package com.github.weberamaral.coffeeworker.adapters.coffee.redis;

import com.github.weberamaral.coffeeworker.order.model.CoffeeOrder;
import com.github.weberamaral.coffeeworker.order.port.CoffeeOrderPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CoffeeOrderAdapter implements CoffeeOrderPort {
  
  @Override
  public void persist(CoffeeOrder coffeeOrder) {
    log.info("Persisting coffer order.... {}", coffeeOrder);
  }
}
