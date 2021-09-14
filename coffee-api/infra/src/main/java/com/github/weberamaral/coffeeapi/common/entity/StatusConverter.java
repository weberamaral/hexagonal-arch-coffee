package com.github.weberamaral.coffeeapi.common.entity;

import com.github.weberamaral.coffeeapi.common.model.Status;

import javax.persistence.AttributeConverter;

public class StatusConverter implements AttributeConverter<Status, Integer> {
  @Override
  public Integer convertToDatabaseColumn(Status attribute) {
    return attribute.getValue();
  }

  @Override
  public Status convertToEntityAttribute(Integer dbData) {
    return Status.of(dbData);
  }
}
