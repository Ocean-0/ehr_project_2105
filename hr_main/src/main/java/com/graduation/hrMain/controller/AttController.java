package com.graduation.hrMain.controller;


import com.graduation.hrApi.service.AttInter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AttController {

    @Reference
    private AttInter attInter;

    @PostMapping("/getAttCount")
    public List<List> getAttCount(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "token")String token,
            HttpServletRequest request
    ) throws Exception {
        return attInter.getAttCount(account);
    }

}
