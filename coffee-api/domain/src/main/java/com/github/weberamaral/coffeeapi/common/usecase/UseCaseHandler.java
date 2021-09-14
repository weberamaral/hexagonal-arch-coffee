package com.github.weberamaral.coffeeapi.common.usecase;

import com.github.weberamaral.coffeeapi.common.model.UseCase;

public interface UseCaseHandler<R, T extends UseCase> {
  R handle(T useCase);
}
