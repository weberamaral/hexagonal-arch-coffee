package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoffeeJpaRepository extends JpaRepository<CoffeeEntity, UUID> {
}
