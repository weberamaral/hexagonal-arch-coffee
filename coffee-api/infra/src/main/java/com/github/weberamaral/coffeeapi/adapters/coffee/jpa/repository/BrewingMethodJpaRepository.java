package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.BrewingMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BrewingMethodJpaRepository extends JpaRepository<BrewingMethodEntity, UUID> {
}
