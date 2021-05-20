package com.graduation.hrApi.service;

import com.graduation.hrApi.entities.base.*;

import java.util.List;

public interface BaseInter {

    public String testDataConn() throws Exception;
    public User getUserById(int id);
    public List<CuBasicData> getCuBasicDataAll();
    public CuBasicData getCuBasicData(String account);
    public CuAccountInfo checkAccount(String account, String password);
    public CuPersonalData getPersonalData(String account);
    public AnSex getAnSex();
    public List getAnAbility(String account);

}
