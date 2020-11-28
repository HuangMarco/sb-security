package com.huangshi.security.demo.controller;


import com.huangshi.security.demo.constant.SBSecurityConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SBSecurityConstants.API)
public class TestController {

    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String getUser(String userName) {
        return "Hello User";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/admin")
    public String getAdmin(String username) {
        return "Hello test";
    }
}
