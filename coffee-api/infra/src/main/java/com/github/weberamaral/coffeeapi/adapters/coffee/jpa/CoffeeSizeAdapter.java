package com.github.weberamaral.coffeeapi.adapters.coffee.jpa;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeSizeEntity;
import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository.CoffeeSizeJpaRepository;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeeSizePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CoffeeSizeAdapter implements CoffeeSizePort {
  
  private final CoffeeSizeJpaRepository coffeeSizeJpaRepository;
  
  @Override
  public List<CoffeeSize> all() {
    return coffeeSizeJpaRepository.findAll()
      .parallelStream()
      .map(CoffeeSizeEntity::toModel)
      .collect(Collectors.toList());
  }
}
