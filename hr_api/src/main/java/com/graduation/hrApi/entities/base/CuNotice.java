package com.graduation.hrApi.entities.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Future;

import java.io.Serializable;
import java.util.Date;

@Entity
public class CuNotice implements Serializable {
    @Id
    @GeneratedValue
    private int rowId;
    private int jobNum;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date noticeDate;
    private String art01;
    private String art02;
    private String art03;
    private String art04;
    private String art05;
    private String noticeTitle;

    public CuNotice() { }

    public CuNotice(int rowId, int jobNum, Date noticeDate, String art01, String art02, String art03, String art04, String art05, String noticeTitle) {
        this.rowId = rowId;
        this.jobNum = jobNum;
        this.noticeDate = noticeDate;
        this.art01 = art01;
        this.art02 = art02;
        this.art03 = art03;
        this.art04 = art04;
        this.art05 = art05;
        this.noticeTitle = noticeTitle;
    }

    @Override
    public String toString() {
        return "CuNotice{" +
                "rowId=" + rowId +
                ", jobNum=" + jobNum +
                ", noticeDate=" + noticeDate +
                ", art01='" + art01 + '\'' +
                ", art02='" + art02 + '\'' +
                ", art03='" + art03 + '\'' +
                ", art04='" + art04 + '\'' +
                ", art05='" + art05 + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
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

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getArt01() {
        return art01;
    }

    public void setArt01(String art01) {
        this.art01 = art01;
    }

    public String getArt02() {
        return art02;
    }

    public void setArt02(String art02) {
        this.art02 = art02;
    }

    public String getArt03() {
        return art03;
    }

    public void setArt03(String art03) {
        this.art03 = art03;
    }

    public String getArt04() {
        return art04;
    }

    public void setArt04(String art04) {
        this.art04 = art04;
    }

    public String getArt05() {
        return art05;
    }

    public void setArt05(String art05) {
        this.art05 = art05;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }
}
