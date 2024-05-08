package com.TRA.tra24Springboot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Order extends BaseEntity {

    List<Product> productsOrdered;
    String categoryName;
    Date orderDate;
    @Enumerated(EnumType.STRING)
    OrderStatus status;

    String description;
    PaymentStatus paymentStatus;
    PaymentType paymentType;
    Date dueDate;
}
