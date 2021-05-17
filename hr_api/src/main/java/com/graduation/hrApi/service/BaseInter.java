package com.graduation.hrApi.service;

import com.graduation.hrApi.entities.base.CuAccountInfo;
import com.graduation.hrApi.entities.base.CuBasicData;
import com.graduation.hrApi.entities.base.CuPersonalData;
import com.graduation.hrApi.entities.base.User;

import java.util.List;

public interface BaseInter {

    public String testDataConn() throws Exception;
    public User getUserById(int id);
    public List<CuBasicData> getCuBasicDataAll();
    public CuAccountInfo checkAccount(String account, String password);
    public CuPersonalData getPersonalData(String account);

}
