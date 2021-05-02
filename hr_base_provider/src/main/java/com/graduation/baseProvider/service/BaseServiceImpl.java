package com.graduation.baseProvider.service;

import com.graduation.baseProvider.mapper.BaseProviderMapper;
import com.graduation.hrApi.entities.base.CuBasicData;
import com.graduation.hrApi.entities.base.User;
import com.graduation.hrApi.service.BaseInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.util.List;

@Service
public class BaseServiceImpl implements BaseInter {

    @Autowired
    DataSource dataSource;

    @Autowired
    BaseProviderMapper baseProviderMapper;

    @Override
    public String testDataConn() throws Exception{
        return "connect successfull" + dataSource.getConnection();
    }

    @Override
    public User getUserById(int id) {
        User u = new User();
        u.setId(1);
        u.setName("hello");
        return u;
    }

    @Override
    public List<CuBasicData> getCuBasicDataAll() {
        return baseProviderMapper.getBasicDataAll();
    }

}
