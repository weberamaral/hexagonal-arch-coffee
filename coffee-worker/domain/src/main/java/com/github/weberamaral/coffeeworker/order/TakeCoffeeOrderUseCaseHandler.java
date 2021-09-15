package com.github.weberamaral.coffeeworker.order;

import com.github.weberamaral.coffeeworker.common.DomainComponent;
import com.github.weberamaral.coffeeworker.common.usecase.VoidUseCaseHandler;
import com.github.weberamaral.coffeeworker.order.port.CoffeeOrderPort;
import com.github.weberamaral.coffeeworker.order.usecase.TakeCoffeeOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@DomainComponent
@RequiredArgsConstructor
@Slf4j
public class TakeCoffeeOrderUseCaseHandler implements VoidUseCaseHandler<TakeCoffeeOrder> {
  
  private final CoffeeOrderPort coffeeOrderPort;
  
  @Override
  public void handle(TakeCoffeeOrder useCase) {
    // 1. Assume o pedido
    // 2. Atualiza o status do pedido para Preparando.....
    useCase.getCoffeeOrder().setStatus("PREPARING");
    // 3. Persiste o pedido com o novo status
    coffeeOrderPort.persist(useCase.getCoffeeOrder());
  }
}
