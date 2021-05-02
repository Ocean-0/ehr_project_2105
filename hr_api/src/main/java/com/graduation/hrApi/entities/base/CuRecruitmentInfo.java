package com.graduation.hrApi.entities.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CuRecruitmentInfo implements Serializable {

    @Id
    @GeneratedValue
    private int rowId;

    private String job;
    private String station;
    private String headCount;
    private String writtenTime;
    private String interviewTime;
    private String company;
    private String department;
    private String base;

    public CuRecruitmentInfo(){}

    public CuRecruitmentInfo(int rowId, String job, String station, String headCount, String writtenTime, String interviewTime, String company, String department, String base) {
        this.rowId = rowId;
        this.job = job;
        this.station = station;
        this.headCount = headCount;
        this.writtenTime = writtenTime;
        this.interviewTime = interviewTime;
        this.company = company;
        this.department = department;
        this.base = base;
    }

    @Override
    public String toString() {
        return "CuRecruitmentInfo{" +
                "rowId=" + rowId +
                ", job='" + job + '\'' +
                ", station='" + station + '\'' +
                ", headCount='" + headCount + '\'' +
                ", writtenTime='" + writtenTime + '\'' +
                ", interviewTime='" + interviewTime + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", base='" + base + '\'' +
                '}';
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getHeadCount() {
        return headCount;
    }

    public void setHeadCount(String headCount) {
        this.headCount = headCount;
    }

    public String getWrittenTime() {
        return writtenTime;
    }

    public void setWrittenTime(String writtenTime) {
        this.writtenTime = writtenTime;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
