package com.library.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.model.UserEntity;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
        public String isLogin(HttpServletRequest request, HttpServletResponse response) {
            UserEntity entity = new UserEntity();
            entity.setId(2);
            if (userService.isUser(entity) > 0) {
                return "success";
            }
        return "index";
    }

}