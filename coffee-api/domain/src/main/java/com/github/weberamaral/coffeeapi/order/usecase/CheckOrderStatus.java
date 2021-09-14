package com.github.weberamaral.coffeeapi.order.usecase;

import com.github.weberamaral.coffeeapi.common.model.UseCase;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Getter
@Builder
public class CheckOrderStatus implements UseCase {
  private UUID orderId;
}
