package com.github.weberamaral.coffeeapi.common.rest;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResponseBuilder {
  
  public static <T> Response<DataResponse<T>> build(List<T> items) {
    return new Response<>(new DataResponse<>(items));
  }
  
  public static <T> Response<DataResponse<T>> build(List<T> items, int page, int size, Long total) {
    return new Response<>(new DataResponse<>(items, page, size, total));
  }
  
  public static <T> Response<T> build(T item) {
    return new Response<>(item);
  }
  
  public static Response<ErrorResponse> build(ErrorResponse errorResponse) {
    return new Response<>(errorResponse);
  }
}
