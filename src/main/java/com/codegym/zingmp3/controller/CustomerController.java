package com.codegym.zingmp3.controller;

import com.codegym.zingmp3.dto.CustomerRequest;
import com.codegym.zingmp3.dto.CustomerResponse;
import com.codegym.zingmp3.dto.UserDto;
import com.codegym.zingmp3.repo.UserRepository;
import com.codegym.zingmp3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private UserService userService;

    @RequestMapping("/customer")
    public CustomerResponse greeting(@RequestBody CustomerRequest input) {
        List<UserDto> users = userService.getAll();
        CustomerResponse output = new CustomerResponse("ok");
        output.setListUser(users);
        return output;
    }
}
