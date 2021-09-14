package com.github.weberamaral.coffeeapi.adapters.coffee.jpa;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeTypeEntity;
import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository.CoffeeTypeJpaRepository;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeeTypePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CoffeeTypeAdapter implements CoffeeTypePort {
  
  private final CoffeeTypeJpaRepository coffeeTypeJpaRepository;
  
  @Override
  public List<CoffeeType> all() {
    return coffeeTypeJpaRepository.findAll()
      .parallelStream()
      .map(CoffeeTypeEntity::toModel)
      .collect(Collectors.toList());
  }
}
