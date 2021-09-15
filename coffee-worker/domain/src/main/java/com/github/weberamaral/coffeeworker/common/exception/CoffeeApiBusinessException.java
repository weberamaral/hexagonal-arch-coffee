package com.github.weberamaral.coffeeworker.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeApiBusinessException extends RuntimeException {
  private final String key;
  private final String[] args;
  
  public CoffeeApiBusinessException(String key) {
    super(key);
    this.key = key;
    this.args = new String[0];
  }
  
  public CoffeeApiBusinessException(String key, String... args) {
    super(key);
    this.key = key;
    this.args = args;
  }
}
