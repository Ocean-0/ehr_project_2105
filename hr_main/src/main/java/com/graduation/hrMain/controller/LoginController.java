package com.graduation.hrMain.controller;

import com.graduation.hrApi.service.BaseInter;
import com.graduation.hrApi.model.*;
import com.graduation.hrMain.Utils.CacheUtil;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

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
        System.out.println(account + " " + passWord + " " + baseInter.checkAccount(account,passWord) + " " + request);
        String token = account+"-"+ UUID.randomUUID();
        if(baseInter.checkAccount(account,passWord) != null) {
            Result temp = CacheUtil.checkLoginIn(token,account,request);
            System.out.println("login:"+ temp + ":::" +request.getRemoteHost());
            return "connection";
        }
        return "connection fail";
    }

}
