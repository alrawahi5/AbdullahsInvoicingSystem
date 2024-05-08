package com.TRA.tra24Springboot.Models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Supplier extends BaseEntity{

    String companyName;
    String country;
    ContactDetails contactDetails;
    List<Product> productsOffered;
    Date nextDeliveryTime;
    List<Product> expectedProducts;
    String complaints;
    String paymentMethods; //TODO: Enum for payment methods
    String shippingMethods;
    String minimumOrderQuantity;
    List<Order> orders;

}
