package com.github.weberamaral.coffeeapi.common.rest;

import java.util.List;

public class BaseController {
  
  public <T> Response<DataResponse<T>> respond(List<T> items) {
    return ResponseBuilder.build(items);
  }
  
  public <T> Response<DataResponse<T>> respond(List<T> items, int page, int size, Long total) {
    return ResponseBuilder.build(items, page, size, total);
  }
  
  protected <T> Response<T> respond(T item) {
    return ResponseBuilder.build(item);
  }
  
  protected Response<ErrorResponse> respond(ErrorResponse errorResponse) {
    return ResponseBuilder.build(errorResponse);
  }
}
