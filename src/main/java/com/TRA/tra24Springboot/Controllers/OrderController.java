package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.TRA.tra24Springboot.DTO.OrderDOT;

@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("add")
    public Order addOrder(Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping("update")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @PostMapping("delete")
    public String deleteOrder(@RequestParam Integer id) {
        orderService.deleteOrder(id);
        return "Success";
    }
}
