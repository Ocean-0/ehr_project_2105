package com.graduation.hrApi.service;

import com.graduation.hrApi.entities.base.CuRecruitment;
import com.graduation.hrApi.entities.base.CuRecruitmentInfo;
import com.graduation.hrApi.entities.base.CuRecruitmentReq;

import java.util.List;

public interface RecruitInter {

    public List<CuRecruitmentInfo> getRecruitInfoAll();

    public List<CuRecruitmentReq> getRecruitReqAll();

    public List<CuRecruitment> getRecruitment();

    public List<CuRecruitment> getRecruitmentPart(String base, String station);
}
