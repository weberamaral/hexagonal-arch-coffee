package com.github.weberamaral.coffeeworker.common.usecase;

import com.github.weberamaral.coffeeworker.common.model.UseCase;

public interface VoidUseCaseHandler<T extends UseCase> {
  void handle(T useCase);
}
