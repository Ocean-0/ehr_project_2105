package com.graduation.hrMain.controller;

import com.graduation.hrApi.entities.base.CuBasicData;
import com.graduation.hrApi.entities.base.CuRecruitment;
import com.graduation.hrApi.entities.base.CuRecruitmentInfo;
import com.graduation.hrApi.entities.base.CuRecruitmentReq;
import com.graduation.hrApi.service.AttInter;
import com.graduation.hrApi.service.BaseInter;
import com.graduation.hrApi.service.RecruitInter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Reference
    private BaseInter baseInter;

    @Reference
    private AttInter attInter;

    @Reference
    private RecruitInter recruitInter;

    @RequestMapping("/test01")
    public String test01(){
        return baseInter.getUserById(1).toString();
    }

    @RequestMapping("/test02")
    public String testDataConn() throws Exception {
        return baseInter.testDataConn();
    }

    @RequestMapping("/test03")
    public String testDataConn02() throws Exception {
        return attInter.testDataConn();
    }

    @RequestMapping("/test04")
    public List<CuBasicData> testDataConn03() throws Exception {
        return baseInter.getCuBasicDataAll();
    }

    @RequestMapping("/test05")
    public List<CuRecruitmentInfo> testDataConn04() throws Exception {
        return recruitInter.getRecruitInfoAll();
    }

    @RequestMapping("/test06")
    public List<CuRecruitmentReq> testDataConn05() throws Exception {
        return recruitInter.getRecruitReqAll();
    }

    @RequestMapping("/getJobList")
    public List<CuRecruitment> getJobList() throws Exception {
        return recruitInter.getRecruitment();
    }

    @PostMapping("/getJobListPart")
    public List<CuRecruitment> getJobList02(
            @RequestParam(value = "workPlace")String workPlace,
            @RequestParam(value = "station")String station
    ) throws Exception {
        System.out.printf(workPlace + " " + station);
        return recruitInter.getRecruitmentPart(workPlace, station);
    }

}
