package com.graduation.hrApi.entities.base;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CuRecruitmentReq implements Serializable {

    @Id
    @GeneratedValue
    private int rowId;

    private String job;
    private String duty;
    private String requirement;
    private String comments;
    private String bonusItems;
    private String treatment;

    public CuRecruitmentReq(){}

    public CuRecruitmentReq(int rowId, String job, String duty, String requirement, String comments, String bonusItems, String treatment) {
        this.rowId = rowId;
        this.job = job;
        this.duty = duty;
        this.requirement = requirement;
        this.comments = comments;
        this.bonusItems = bonusItems;
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "CuRecruitmentReq{" +
                "rowId=" + rowId +
                ", job='" + job + '\'' +
                ", duty='" + duty + '\'' +
                ", requirement='" + requirement + '\'' +
                ", comments='" + comments + '\'' +
                ", bonusItems='" + bonusItems + '\'' +
                ", treatment='" + treatment + '\'' +
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
