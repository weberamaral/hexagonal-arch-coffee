package com.github.weberamaral.coffeeapi.common.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@NoArgsConstructor
public class Response<T> {
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private T data;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private ErrorResponse errors;
  
  public Response(T data) {
    this.data = data;
  }
  
  public Response(ErrorResponse errors) {
    this.errors = errors;
  }
}
