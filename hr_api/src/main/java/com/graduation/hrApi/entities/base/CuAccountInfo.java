package com.graduation.hrApi.entities.base;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class CuAccountInfo implements Serializable {

    @Id
    @GeneratedValue
    private int jobNum;

    @NotNull(message = "密码不能为空")
    private String password;

    @NotNull(message = "等级不能为空")
    private String level;

    public CuAccountInfo(){}

    public CuAccountInfo(int jobNum, String password, String level) {
        this.jobNum = jobNum;
        this.password = password;
        this.level = level;
    }

    @Override
    public String toString() {
        return "CuAccountInfo{" +
                "jobNum=" + jobNum +
                ", password='" + password + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public int getJobNum() {
        return jobNum;
    }

    public void setJobNum(int jobNum) {
        this.jobNum = jobNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
