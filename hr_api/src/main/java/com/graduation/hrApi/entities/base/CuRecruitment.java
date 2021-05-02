package com.graduation.hrApi.entities.base;

import java.io.Serializable;

public class CuRecruitment implements Serializable {

    private int rowId;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    private String job;
    private String station;
    private String headCount;
    private String writtenTime;
    private String interviewTime;
    private String company;
    private String department;
    private String base;

//    private String job;
    private String duty;
    private String requirement;
    private String comments;
    private String bonusItems;
    private String treatment;

    public CuRecruitment(){}

    public CuRecruitment(int rowId, String job, String station, String headCount, String writtenTime, String interviewTime, String company, String department, String base, String duty, String requirement, String comments, String bonusItems, String treatment) {
        this.rowId = rowId;
        this.job = job;
        this.station = station;
        this.headCount = headCount;
        this.writtenTime = writtenTime;
        this.interviewTime = interviewTime;
        this.company = company;
        this.department = department;
        this.base = base;
        this.duty = duty;
        this.requirement = requirement;
        this.comments = comments;
        this.bonusItems = bonusItems;
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "CuRecruitment{" +
                "job='" + job + '\'' +
                ", station='" + station + '\'' +
                ", headCount='" + headCount + '\'' +
                ", writtenTime='" + writtenTime + '\'' +
                ", interviewTime='" + interviewTime + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", base='" + base + '\'' +
                ", duty='" + duty + '\'' +
                ", requirement='" + requirement + '\'' +
                ", comments='" + comments + '\'' +
                ", bonusItems='" + bonusItems + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBonusItems() {
        return bonusItems;
    }

    public void setBonusItems(String bonusItems) {
        this.bonusItems = bonusItems;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
