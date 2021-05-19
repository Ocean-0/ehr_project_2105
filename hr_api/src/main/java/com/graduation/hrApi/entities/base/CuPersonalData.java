package com.graduation.hrApi.entities.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Future;
import java.io.Serializable;
import java.util.Date;

public class CuPersonalData implements Serializable {

//  ## jobinfo(职务信息)
    private int jobNum;
    private String company;
    private String department;
    private String station;
    private String job;
    private String rank;
    private String base;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date entryDate;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date internship;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date officialDate;
//  ## workhistory(内部工作经历)
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date inBeginTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date inEndTime;
    private String inDepartment;
    private String inStation;
//  ## workouthistory(外部工作经历)
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date outBeginTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date outEndTime;
    private String outCompany;
    private String outDepartment;
    private String outStation;
//  ## eduinfo(教育信息)
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date eduBeginTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date eduEndTime;
    private String school;
    private String edu;
    private String major;
    private String eduMode;
//  ## familymembers(家庭成员)
    private String relation;
    private String otherName;
    private String otherSex;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date otherBirthday;
    private String otherNationality;
    private String otherPhone;
    private String otherAddress;
//  ## skill(证书技能)
    private String certName;
    private String certLevel;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date certTime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @Future
    private Date dueDate;
    private String appendixSize;
    private String appendixType;
    private String comments;

    public CuPersonalData(){}

    public CuPersonalData(int jobNum, String company, String department, String station, String job, String rank, String base, Date entryDate, Date internship, Date officialDate, Date inBeginTime, Date inEndTime, String inDepartment, String inStation, Date outBeginTime, Date outEndTime, String outCompany, String outDepartment, String outStation, Date eduBeginTime, Date eduEndTime, String school, String edu, String major, String eduMode, String relation, String otherName, String otherSex, Date otherBirthday, String otherNationality, String otherPhone, String otherAddress, String certName, String certLevel, Date certTime, Date dueDate, String appendixSize, String appendixType, String comments) {
        this.jobNum = jobNum;
        this.company = company;
        this.department = department;
        this.station = station;
        this.job = job;
        this.rank = rank;
        this.base = base;
        this.entryDate = entryDate;
        this.internship = internship;
        this.officialDate = officialDate;
        this.inBeginTime = inBeginTime;
        this.inEndTime = inEndTime;
        this.inDepartment = inDepartment;
        this.inStation = inStation;
        this.outBeginTime = outBeginTime;
        this.outEndTime = outEndTime;
        this.outCompany = outCompany;
        this.outDepartment = outDepartment;
        this.outStation = outStation;
        this.eduBeginTime = eduBeginTime;
        this.eduEndTime = eduEndTime;
        this.school = school;
        this.edu = edu;
        this.major = major;
        this.eduMode = eduMode;
        this.relation = relation;
        this.otherName = otherName;
        this.otherSex = otherSex;
        this.otherBirthday = otherBirthday;
        this.otherNationality = otherNationality;
        this.otherPhone = otherPhone;
        this.otherAddress = otherAddress;
        this.certName = certName;
        this.certLevel = certLevel;
        this.certTime = certTime;
        this.dueDate = dueDate;
        this.appendixSize = appendixSize;
        this.appendixType = appendixType;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CuPersonalData{" +
                "jobNum=" + jobNum +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", station='" + station + '\'' +
                ", job='" + job + '\'' +
                ", rank='" + rank + '\'' +
                ", base='" + base + '\'' +
                ", entryDate=" + entryDate +
                ", internship=" + internship +
                ", officialDate=" + officialDate +
                ", inBeginTime=" + inBeginTime +
                ", inEndTime=" + inEndTime +
                ", inDepartment='" + inDepartment + '\'' +
                ", inStation='" + inStation + '\'' +
                ", outBeginTime=" + outBeginTime +
                ", outEndTime=" + outEndTime +
                ", outCompany='" + outCompany + '\'' +
                ", outDepartment='" + outDepartment + '\'' +
                ", outStation='" + outStation + '\'' +
                ", eduBeginTime=" + eduBeginTime +
                ", eduEndTime=" + eduEndTime +
                ", school='" + school + '\'' +
                ", edu='" + edu + '\'' +
                ", major='" + major + '\'' +
                ", eduMode='" + eduMode + '\'' +
                ", relation='" + relation + '\'' +
                ", otherName='" + otherName + '\'' +
                ", otherSex='" + otherSex + '\'' +
                ", otherBirthday=" + otherBirthday +
                ", otherNationality='" + otherNationality + '\'' +
                ", otherPhone='" + otherPhone + '\'' +
                ", otherAddress='" + otherAddress + '\'' +
                ", certName='" + certName + '\'' +
                ", certLevel='" + certLevel + '\'' +
                ", certTime=" + certTime +
                ", dueDate=" + dueDate +
                ", appendixSize='" + appendixSize + '\'' +
                ", appendixType='" + appendixType + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    public int getJobNum() {
        return jobNum;
    }

    public void setJobNum(int jobNum) {
        this.jobNum = jobNum;
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

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getInternship() {
        return internship;
    }

    public void setInternship(Date internship) {
        this.internship = internship;
    }

    public Date getOfficialDate() {
        return officialDate;
    }

    public void setOfficialDate(Date officialDate) {
        this.officialDate = officialDate;
    }

    public Date getInBeginTime() {
        return inBeginTime;
    }

    public void setInBeginTime(Date inBeginTime) {
        this.inBeginTime = inBeginTime;
    }

    public Date getInEndTime() {
        return inEndTime;
    }

    public void setInEndTime(Date inEndTime) {
        this.inEndTime = inEndTime;
    }

    public String getInDepartment() {
        return inDepartment;
    }

    public void setInDepartment(String inDepartment) {
        this.inDepartment = inDepartment;
    }

    public String getInStation() {
        return inStation;
    }

    public void setInStation(String inStation) {
        this.inStation = inStation;
    }

    public Date getOutBeginTime() {
        return outBeginTime;
    }

    public void setOutBeginTime(Date outBeginTime) {
        this.outBeginTime = outBeginTime;
    }

    public Date getOutEndTime() {
        return outEndTime;
    }

    public void setOutEndTime(Date outEndTime) {
        this.outEndTime = outEndTime;
    }

    public String getOutCompany() {
        return outCompany;
    }

    public void setOutCompany(String outCompany) {
        this.outCompany = outCompany;
    }

    public String getOutDepartment() {
        return outDepartment;
    }

    public void setOutDepartment(String outDepartment) {
        this.outDepartment = outDepartment;
    }

    public String getOutStation() {
        return outStation;
    }

    public void setOutStation(String outStation) {
        this.outStation = outStation;
    }

    public Date getEduBeginTime() {
        return eduBeginTime;
    }

    public void setEduBeginTime(Date eduBeginTime) {
        this.eduBeginTime = eduBeginTime;
    }

    public Date getEduEndTime() {
        return eduEndTime;
    }

    public void setEduEndTime(Date eduEndTime) {
        this.eduEndTime = eduEndTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEduMode() {
        return eduMode;
    }

    public void setEduMode(String eduMode) {
        this.eduMode = eduMode;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getOtherSex() {
        return otherSex;
    }

    public void setOtherSex(String otherSex) {
        this.otherSex = otherSex;
    }

    public Date getOtherBirthday() {
        return otherBirthday;
    }

    public void setOtherBirthday(Date otherBirthday) {
        this.otherBirthday = otherBirthday;
    }

    public String getOtherNationality() {
        return otherNationality;
    }

    public void setOtherNationality(String otherNationality) {
        this.otherNationality = otherNationality;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertLevel() {
        return certLevel;
    }

    public void setCertLevel(String certLevel) {
        this.certLevel = certLevel;
    }

    public Date getCertTime() {
        return certTime;
    }

    public void setCertTime(Date certTime) {
        this.certTime = certTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getAppendixSize() {
        return appendixSize;
    }

    public void setAppendixSize(String appendixSize) {
        this.appendixSize = appendixSize;
    }

    public String getAppendixType() {
        return appendixType;
    }

    public void setAppendixType(String appendixType) {
        this.appendixType = appendixType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
