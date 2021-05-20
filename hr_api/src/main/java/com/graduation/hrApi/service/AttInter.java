package com.graduation.hrApi.service;

import com.graduation.hrApi.entities.base.AttCount;

import java.util.List;

public interface AttInter {

    public String testDataConn() throws Exception;
    public List<List> getAttCount(String account);

}
