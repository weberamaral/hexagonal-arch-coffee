package com.github.weberamaral.coffeeapi.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeApiDataNotFoundException extends RuntimeException {
  private final String key;
  private final String[] args;

  public CoffeeApiDataNotFoundException(String key) {
    super(key);
    this.key = key;
    this.args = new String[0];
  }

  public CoffeeApiDataNotFoundException(String key, String... args) {
    super(key);
    this.key = key;
    this.args = args;
  }
}
