package com.graduation.AttProvider.service;

import com.graduation.AttProvider.mapper.AttProviderMapper;
import com.graduation.hrApi.entities.base.AttCount;
import com.graduation.hrApi.service.AttInter;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class AttServiceImpl implements AttInter {

    @Autowired
    DataSource dataSource;

    @Autowired
    AttProviderMapper attProviderMapper;

    @Override
    public String testDataConn() throws Exception {
        return "connect successfull" + dataSource.getConnection();
    }

    @Override
    public List<List> getAttCount(String account) {
        List<AttCount> att = attProviderMapper.getAttCount(account);
        int index;
        List result = new ArrayList();
        for(index = 0; index < att.size(); index++){
            List temp = new ArrayList();
            temp.add(att.get(index).getCoutDate());
            temp.add(att.get(index).getHours());
            result.add(temp);
        }
        return result;
    }
}
