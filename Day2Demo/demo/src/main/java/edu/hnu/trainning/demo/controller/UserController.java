package edu.hnu.trainning.demo.controller;

import edu.hnu.trainning.demo.common.Result;
import edu.hnu.trainning.demo.entity.User;
import edu.hnu.trainning.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public Result addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/user")
    public Result showUsers() {
        return userService.showUsers();
    }




}
