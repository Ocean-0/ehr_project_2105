package com.graduation.hrApi.service;

import com.graduation.hrApi.entities.base.CuBasicData;
import com.graduation.hrApi.entities.base.User;

import java.util.List;

public interface BaseInter {

    public String testDataConn() throws Exception;
    public User getUserById(int id);
    public List<CuBasicData> getCuBasicDataAll();

}
