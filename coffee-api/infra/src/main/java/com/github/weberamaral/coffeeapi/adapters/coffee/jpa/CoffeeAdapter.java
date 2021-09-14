package com.github.weberamaral.coffeeapi.adapters.coffee.jpa;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeEntity;
import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository.CoffeeJpaRepository;
import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CoffeeAdapter implements CoffeePort {
  
  private final CoffeeJpaRepository coffeeJpaRepository;

  @Override
  public List<Coffee> all() {
    return coffeeJpaRepository.findAll()
      .parallelStream()
      .map(CoffeeEntity::toModel)
      .collect(Collectors.toList());
  }

  @Override
  public Coffee create(Coffee coffee) {
    var entity = CoffeeEntity.fromModel(coffee);
    return coffeeJpaRepository.save(entity).toModel();
  }
}
