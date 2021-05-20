package com.graduation.hrMain.controller;

import com.graduation.hrApi.entities.base.AnSex;
import com.graduation.hrApi.entities.base.CuBasicData;
import com.graduation.hrApi.entities.base.CuPersonalData;
import com.graduation.hrApi.model.Result;
import com.graduation.hrApi.service.BaseInter;
import com.graduation.hrMain.Utils.CacheUtil;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@RestController
public class BaseController {

    @Reference
    private BaseInter baseInter;

    @PostMapping("/getPersonalData")
    public CuPersonalData getPersonalData(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "token")String token,
            HttpServletRequest request
    ) throws Exception {
        return baseInter.getPersonalData(account);
    }

    @PostMapping("/getBasicData")
    public CuBasicData getBasicData(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "token")String token,
            HttpServletRequest request
    ) throws Exception {
        return baseInter.getCuBasicData(account);
    }

    @PostMapping("/getAnSex")
    public AnSex getAnSex(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "token")String token,
            HttpServletRequest request
    ) throws Exception {
        return baseInter.getAnSex();
    }

    @PostMapping("/getAnAbiliy")
    public List getAnAbiliy(
            @RequestParam(value = "account")String account,
            @RequestParam(value = "token")String token,
            HttpServletRequest request
    ) throws Exception {
        return baseInter.getAnAbility(account);
    }

}
