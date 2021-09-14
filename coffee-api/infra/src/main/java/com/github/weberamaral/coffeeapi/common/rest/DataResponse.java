package com.github.weberamaral.coffeeapi.common.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
public class DataResponse<T> {
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<T> items = List.of();
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer page;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer size;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Long totalSize;
  
  public DataResponse() {
  }
  
  public DataResponse(List<T> items) {
    this.items = items;
  }
  
  public DataResponse(List<T> items, Integer page, Integer size, Long total) {
    this.items = items;
    this.page = page;
    this.size = size;
    this.totalSize = total;
  }
}
