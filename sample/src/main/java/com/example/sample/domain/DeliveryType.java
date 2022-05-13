package com.example.sample.domain;

import java.util.Arrays;

public enum DeliveryType {
  EMERGENCY, RESERVATION;

  public static DeliveryType findType(String type) {
    return Arrays.stream(DeliveryType.values())
        .filter(t -> t.name().equals(type))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
