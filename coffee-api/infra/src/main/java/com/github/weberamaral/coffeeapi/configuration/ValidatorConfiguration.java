package com.github.weberamaral.coffeeapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ValidatorConfiguration implements WebMvcConfigurer {
  private final Validator validator;
  
  public ValidatorConfiguration(Validator validator) {
    this.validator = validator;
  }
  
  @Override
  public Validator getValidator() {
    return validator;
  }
}
