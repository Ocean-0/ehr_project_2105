package com.graduation.hrApi.entities.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import java.io.Serializable;
import java.util.Date;

@Entity
public class AttCount implements Serializable {

    @Id
    @GeneratedValue
    private int rowId;

    private int jobNum;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Future
    private Date workTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Future
    private Date offTime;
    private double hours;
//    @DateTimeFormat(pattern="yyyy-MM-dd")
//    @Future
//    @JsonFormat(pattern="yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date coutDate;

    public AttCount() { }

    public AttCount(int rowId, int jobNum, Date workTime, Date offTime, double hours, Date coutDate) {
        this.rowId = rowId;
        this.jobNum = jobNum;
        this.workTime = workTime;
        this.offTime = offTime;
        this.hours = hours;
        this.coutDate = coutDate;
    }

    @Override
    public String toString() {
        return "AttCount{" +
                "rowId=" + rowId +
                ", jobNum=" + jobNum +
                ", workTime=" + workTime +
                ", offTime=" + offTime +
                ", hours=" + hours +
                ", coutDate=" + coutDate +
                '}';
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getJobNum() {
        return jobNum;
    }

    public void setJobNum(int jobNum) {
        this.jobNum = jobNum;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Date getCoutDate() {
        return coutDate;
    }

    public void setCoutDate(Date coutDate) {
        this.coutDate = coutDate;
    }
}
