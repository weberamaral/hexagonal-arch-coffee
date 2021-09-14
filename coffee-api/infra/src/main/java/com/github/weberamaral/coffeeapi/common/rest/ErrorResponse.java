package com.github.weberamaral.coffeeapi.common.rest;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
  private String errorCode;
  private String errorDescription;
}
