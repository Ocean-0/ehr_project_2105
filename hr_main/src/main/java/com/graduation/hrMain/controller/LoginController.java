package com.graduation.hrMain.controller;

import com.graduation.hrApi.service.BaseInter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class LoginController {

    @Reference
    private BaseInter baseInter;

    @PostMapping("/login")
    public String login(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "passWord")String passWord,
            HttpServletRequest request
    ) throws Exception {
        System.out.printf(account + " " + passWord + " " + baseInter.checkAccount(account,passWord) + " " + request);
        if(baseInter.checkAccount(account,passWord) != null)return "connection";
        return "connection fail";
    }

}
