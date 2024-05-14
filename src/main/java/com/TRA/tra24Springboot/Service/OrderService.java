package com.TRA.tra24Springboot.Service;

import com.TRA.tra24Springboot.DTO.ContactDetailsDTO;
import com.TRA.tra24Springboot.DTO.OrderDOT;
import com.TRA.tra24Springboot.Models.*;
import com.TRA.tra24Springboot.Repository.OrderRepository;
import com.TRA.tra24Springboot.Repository.ProductRepository;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.TRA.tra24Springboot.Models.OrderStatus.PENDING;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order addOrder(Order order) {

        /*OneToMany
        List<Product> productsOrdered;
        String categoryName;
        Date orderDate;
        @Enumerated(EnumType.STRING)
        OrderStatus status;
        String description;
        @Enumerated(EnumType.STRING)
        PaymentStatus paymentStatus;
        @Enumerated(EnumType.STRING)
        PaymentType paymentType;
        Date dueDate;*/
        List<Product> productList = null;
        order.setProductsOrdered(productList);
        order.setCategoryName("Drinks");
        order.setStatus(PENDING);
        order.setDescription("Limon flavour");
        order.setOrderDate(new Date());

        return orderRepository.save(order);
    }

    public String deleteOrder(Integer id) {
        Order order = orderRepository.findById(id).get();

        if (order.getId().equals(id)) {
            order.setIsActive(Boolean.FALSE);
            System.out.println(order.toString());
        }
        return "Success";
    }

    public Order updateOrder(Order order) {

        Order orderEntity = orderRepository.findById(order.getId()).get();
        orderEntity = order;

/*      List<Product> productList = order.getProductsOrdered();
        String orderCatName = order.getCategoryName();
        OrderStatus orderStatus = order.getStatus();
        String orderDescription = order.getDescription();

        order.setProductsOrdered(productList);
        order.setCategoryName(orderCatName);
        order.setStatus(orderStatus);
        order.setDescription(orderDescription);*/

        order.setUpdatedDate(new Date());

        return orderRepository.save(orderEntity);
    }

    public OrderDOT reportOrders(Order order) {
        return OrderDOT.convertToDTO(order);
    }
}
