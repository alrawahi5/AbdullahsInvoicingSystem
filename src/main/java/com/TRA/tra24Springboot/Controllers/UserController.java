package com.TRA.tra24Springboot.Controllers;

import com.TRA.tra24Springboot.DTO.UserDTO;
import com.TRA.tra24Springboot.Models.User;
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

    @PostMapping("delete")
    public String deleteUser(@RequestParam Integer id) {
        userService.deleteUser(id);
        return "Success";
    }

    @PutMapping("update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("get")
    public List<UserDTO> getUser() {
        return userService.getUser();
    }
}
