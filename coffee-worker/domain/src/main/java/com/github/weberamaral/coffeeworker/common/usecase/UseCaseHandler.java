package com.github.weberamaral.coffeeworker.common.usecase;

import com.github.weberamaral.coffeeworker.common.model.UseCase;

public interface UseCaseHandler<R, T extends UseCase> {
  R handle(T useCase);
}
