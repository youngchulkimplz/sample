package com.example.sample.domain;

import java.util.Arrays;

public enum DeliveryState {
  WAIT, ARRIVAL, PICKUP, ORDER, COMPLETION;

  public static DeliveryState findState(String state) {
    return Arrays.stream(DeliveryState.values())
        .filter(s -> s.name().equals(state))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
