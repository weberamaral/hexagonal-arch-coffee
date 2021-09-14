package com.github.weberamaral.coffeeapi.common.usecase;

import com.github.weberamaral.coffeeapi.common.model.UseCase;

public interface VoidUseCaseHandler<T extends UseCase> {
  void handle(T useCase);
}
