package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.OrderDOT;
import com.TRA.tra24Springboot.Models.Order;
import com.TRA.tra24Springboot.Models.User;
import com.TRA.tra24Springboot.Service.OrderService;
import com.TRA.tra24Springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("add")
    public User adduser(User user) {
        return userService.adduser(user);
    }

    /*@PutMapping("update")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.updateOrder(order);
    }

    @PostMapping("delete")
    public String deleteOrder(@RequestParam Integer id) {
        orderService.deleteOrder(id);
        return "Success";
    }

    @GetMapping("get")
    public List<OrderDOT> getOrder() {
        return orderService.getOrder();
    }*/
}
