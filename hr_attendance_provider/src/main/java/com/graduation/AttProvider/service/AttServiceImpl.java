package com.graduation.AttProvider.service;

import com.graduation.hrApi.service.AttInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

@Service
public class AttServiceImpl implements AttInter {

    @Autowired
    DataSource dataSource;

    @Override
    public String testDataConn() throws Exception {
        return "connect successfull" + dataSource.getConnection();
    }
}
