package com.github.weberamaral.coffeeapi;

import com.github.weberamaral.coffeeapi.common.DomainComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(
  includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {DomainComponent.class})
  }
)
public class CoffeeApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(CoffeeApiApplication.class, args);
  }
}
