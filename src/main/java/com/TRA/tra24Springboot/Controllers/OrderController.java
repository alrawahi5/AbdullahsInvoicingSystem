package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("add")
    public Order addOrder(Order order){
        return orderService.addOrder(order);
    }
}
