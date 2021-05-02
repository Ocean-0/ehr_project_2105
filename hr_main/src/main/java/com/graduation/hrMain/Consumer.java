package com.graduation.hrMain;

import com.graduation.hrApi.entities.base.User;
import com.graduation.hrApi.service.BaseInter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {

    @Reference
    private BaseInter baseInter;

    @Override
    public void run(String... args) throws Exception {
        User u = baseInter.getUserById(1);
        System.out.println(u.toString());
    }
}
