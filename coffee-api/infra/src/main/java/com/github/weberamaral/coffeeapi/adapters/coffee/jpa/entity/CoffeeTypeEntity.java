package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity;

import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.common.entity.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "coffeeType")
@Table(name = "coffee_type")
public class CoffeeTypeEntity extends AbstractEntity {
  
  @Column(nullable = false, unique = true)
  private String type;
  
  public CoffeeType toModel() {
    UUID id = !StringUtils.isEmpty(this.getId()) ? UUID.fromString(this.getId()) : null;
    
    return CoffeeType.builder()
      .id(id)
      .type(getType())
      .build();
  }
}
