package com.github.weberamaral.coffeeapi.adapters.coffee.jpa.entity;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.common.entity.AbstractEntity;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "coffee")
@Table(name = "coffee")
public class CoffeeEntity extends AbstractEntity {
  
  @Column(nullable = false, unique = true)
  private String name;
  
  @Column(nullable = false)
  private String type;

  @Column(nullable = false)
  private String method;

  @Column(nullable = false)
  private String size;
  
  public CoffeeEntity(UUID id, String name, String type, String method, String size) {
    super.setId(id.toString());
    this.name = name;
    this.method = method;
    this.size = size;
    this.type = type;
  }
  
  public Coffee toModel() {
    UUID id = !StringUtils.isEmpty(this.getId()) ? UUID.fromString(this.getId()) : null;
    
    return Coffee.builder()
      .id(id)
      .name(this.getName())
      .method(BrewingMethod.builder().method(this.getMethod()).build())
      .size(CoffeeSize.builder().size(this.getSize()).build())
      .type(CoffeeType.builder().type(this.getType()).build())
      .build();
  }
  
  public static CoffeeEntity fromModel(Coffee coffee) {
    return new CoffeeEntity(
      coffee.getId(),
      coffee.getName(),
      coffee.getType().getType(),
      coffee.getMethod().getMethod(),
      coffee.getSize().getSize()
    );
  }
}
