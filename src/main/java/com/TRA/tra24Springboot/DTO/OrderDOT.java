package com.TRA.tra24Springboot.DTO;

import com.TRA.tra24Springboot.Models.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class OrderDOT {

    List<Product> productsOrdered;
    String categoryName;
    Date orderDate;
    OrderStatus status;
    String description;
    PaymentStatus paymentStatus;
    PaymentType paymentType;
    Date dueDate;

    public static OrderDOT convertToDTO(Order order) {
        OrderDOT orderDOT = new OrderDOT();
        orderDOT.setProductsOrdered(order.getProductsOrdered());
        orderDOT.setCategoryName(order.getCategoryName());
        orderDOT.setOrderDate(order.getOrderDate());
        orderDOT.setStatus(order.getStatus());
        orderDOT.setDescription(order.getDescription());
        orderDOT.setProductsOrdered(order.getProductsOrdered());
        orderDOT.setPaymentType(order.getPaymentType());
        orderDOT.setDueDate(order.getDueDate());
        return orderDOT;
    }

    public static List<OrderDOT> convertToDTO(List<Order> orderList) {
        List<OrderDOT> orderDOTS = new ArrayList<>();
        for (Order oblFromTheDB : orderList) {
            OrderDOT dto = convertToDTO(oblFromTheDB);
            orderDOTS.add(dto);
        }
        return orderDOTS;
    }
}
