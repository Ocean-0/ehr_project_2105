package com.graduation.baseProvider.service;

import com.graduation.baseProvider.mapper.RecruitProviderMapper;
import com.graduation.hrApi.entities.base.CuRecruitment;
import com.graduation.hrApi.entities.base.CuRecruitmentInfo;
import com.graduation.hrApi.entities.base.CuRecruitmentReq;
import com.graduation.hrApi.service.RecruitInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitInter {

    @Autowired
    RecruitProviderMapper recruitProviderMapper;

    @Override
    public List<CuRecruitmentInfo> getRecruitInfoAll() {
        return recruitProviderMapper.getRecruitInfoAll();
    }

    @Override
    public List<CuRecruitmentReq> getRecruitReqAll() {
        return recruitProviderMapper.getRecruitReqAll();
    }

    @Override
    public List<CuRecruitment> getRecruitment() {
        return recruitProviderMapper.getRecruitment();
    }

    @Override
    public List<CuRecruitment> getRecruitmentPart(String base, String station) {
        if("不限".equals(base) && "不限".equals(station)){
            return recruitProviderMapper.getRecruitment();
        }
        return recruitProviderMapper.getRecruitmentPart(base,station);
    }
}
