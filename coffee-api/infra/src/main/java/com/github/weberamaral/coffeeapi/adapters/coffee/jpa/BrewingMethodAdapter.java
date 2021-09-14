package com.github.weberamaral.coffeeapi.adapters.coffee.jpa;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.BrewingMethodEntity;
import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository.BrewingMethodJpaRepository;
import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.port.BrewingMethodPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrewingMethodAdapter implements BrewingMethodPort {
  
  private final BrewingMethodJpaRepository brewingMethodJpaRepository;
  
  @Override
  public List<BrewingMethod> all() {
    return brewingMethodJpaRepository.findAll()
      .parallelStream()
      .map(BrewingMethodEntity::toModel)
      .collect(Collectors.toList());
  }
}
