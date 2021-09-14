package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.repository;

import com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity.CoffeeSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CoffeeSizeJpaRepository extends JpaRepository<CoffeeSizeEntity, UUID> {
}
