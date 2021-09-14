package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoffeeTypeJpaRepository extends JpaRepository<CoffeeTypeEntity, UUID> {
}
