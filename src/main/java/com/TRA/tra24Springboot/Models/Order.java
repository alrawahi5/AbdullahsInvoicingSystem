package com.TRA.tra24Springboot.Models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Order extends BaseEntity {

    List<Product> productsOrdered;
    String categoryName;
    Date orderDate;
    OrderStatus status;
    String description;
    PaymentStatus paymentStatus;
    PaymentType paymentType;
    Date dueDate;
}
