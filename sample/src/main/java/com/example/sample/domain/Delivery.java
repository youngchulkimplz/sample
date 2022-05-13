package com.example.sample.domain;

import com.sun.istack.NotNull;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Getter
@NoArgsConstructor
public class Delivery {

  @Id
  @Column
  private Long deliveryId;

  @NotNull
  private String deliveryDetail;

  @NotNull
  private long deliveryFee;

  @NotNull
  private long deliveryDistance;

  @NotNull
  private DeliveryType deliveryType;

  @NotNull
  private DeliveryState deliveryState;

  private String deliveryCode;

  private LocalDateTime requestPickUpTime;

  private LocalDateTime requestCompletionTime;

  @NotNull
  private String destination;

  @NotNull
  private String destinationDetail;

  @NotNull
  private LocalDateTime createTime;

  @UpdateTimestamp
  private LocalDateTime updateTime;

  private LocalDateTime completionTime;

  @NotNull
  private String shopName;

  private Long pacerId;

  @Builder
  public Delivery(
      Long deliveryId,
      String deliveryDetail,
      int deliveryFee,
      int deliveryDistance,
      DeliveryType deliveryType,
      DeliveryState deliveryState,
      String deliveryCode,
      LocalDateTime requestPickUpTime,
      LocalDateTime requestCompletionTime,
      String destination,
      String destinationDetail,
      LocalDateTime createTime,
      LocalDateTime updateTime,
      LocalDateTime completionTime,
      String shopName,
      Long pacerId
  ) {
    this.deliveryId = deliveryId;
    this.deliveryDetail = deliveryDetail;
    this.deliveryFee = deliveryFee;
    this.deliveryDistance = deliveryDistance;
    this.deliveryType = deliveryType;
    this.deliveryState = deliveryState;
    this.deliveryCode = deliveryCode;
    this.requestPickUpTime = requestPickUpTime;
    this.requestCompletionTime = requestCompletionTime;
    this.destination = destination;
    this.destinationDetail = destinationDetail;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.completionTime = completionTime;
    this.shopName = shopName;
    this.pacerId = pacerId;
  }
}
