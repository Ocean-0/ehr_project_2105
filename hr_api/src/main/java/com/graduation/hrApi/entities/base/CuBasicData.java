package com.graduation.hrApi.entities.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
public class CuBasicData implements Serializable {

    @Id
    @GeneratedValue
    private int jobNum;

    @NotNull(message = "姓名不能为空")
    private String userName;

    @NotNull(message = "性别不能为空")
    private String sex;

    @NotNull(message = "出生日期不能为空")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Future
    private Date birthday;

    @NotNull(message = "籍贯不能为空")
    private String nativePlace;

    @NotNull(message = "民族不能为空")
    private String nation;

    @NotNull(message = "国籍不能为空")
    private String nationality;

    @NotNull(message = "最高学历不能为空")
    private String highestEdu;

    @NotNull(message = "最高学位不能为空")
    private String highestDegree;

    @NotNull(message = "证件类型不能为空")
    private String idType;

    @NotNull(message = "证件号码不能为空")
    private String idNum;

    @NotNull(message = "英文名不能为空")
    private String enName;

    @NotNull(message = "移动电话不能为空")
    private String phone;

    @NotNull(message = "移动电话2不能为空")
    private String phoneTemp;

    @NotNull(message = "邮箱不能为空")
    private String email;

    @NotNull(message = "政治面貌不能为空")
    private String politicalStatus;

    @NotNull(message = "紧急联系人不能为空")
    private String contactTemp;

    @NotNull(message = "紧急联系电话不能为空")
    private String contactPhoneTemp;

    @NotNull(message = "婚姻情况不能为空")
    private String maritalStatus;

    @NotNull(message = "家庭地址不能为空")
    private String homeAddress;

    @NotNull(message = "户口地址不能为空")
    private String registeredAddress;

    @NotNull(message = "工资卡号不能为空")
    private String salary;

    @NotNull(message = "社保登入卡号不能为空")
    private String loginPhone;

    public CuBasicData(){}

    public CuBasicData(int jobNum, String userName, String sex, Date birthday, String nativePlace, String nation, String nationality, String highestEdu, String highestDegree, String idType, String idNum, String enName, String phone, String phoneTemp, String email, String politicalStatus, String contactTemp, String contactPhoneTemp, String maritalStatus, String homeAddress, String registeredAddress, String salary, String loginPhone) {
        this.jobNum = jobNum;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
        this.nation = nation;
        this.nationality = nationality;
        this.highestEdu = highestEdu;
        this.highestDegree = highestDegree;
        this.idType = idType;
        this.idNum = idNum;
        this.enName = enName;
        this.phone = phone;
        this.phoneTemp = phoneTemp;
        this.email = email;
        this.politicalStatus = politicalStatus;
        this.contactTemp = contactTemp;
        this.contactPhoneTemp = contactPhoneTemp;
        this.maritalStatus = maritalStatus;
        this.homeAddress = homeAddress;
        this.registeredAddress = registeredAddress;
        this.salary = salary;
        this.loginPhone = loginPhone;
    }

    @Override
    public String toString() {
        return "CuBasicData{" +
                "jobNum=" + jobNum +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", nativePlace='" + nativePlace + '\'' +
                ", nation='" + nation + '\'' +
                ", nationality='" + nationality + '\'' +
                ", highestEdu='" + highestEdu + '\'' +
                ", highestDegree='" + highestDegree + '\'' +
                ", idType='" + idType + '\'' +
                ", idNum='" + idNum + '\'' +
                ", enName='" + enName + '\'' +
                ", phone='" + phone + '\'' +
                ", phoneTemp='" + phoneTemp + '\'' +
                ", email='" + email + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", contactTemp='" + contactTemp + '\'' +
                ", contactPhoneTemp='" + contactPhoneTemp + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", registeredAddress='" + registeredAddress + '\'' +
                ", salary='" + salary + '\'' +
                ", loginPhone='" + loginPhone + '\'' +
                '}';
    }

    public int getJobNum() {
        return jobNum;
    }

    public void setJobNum(int jobNum) {
        this.jobNum = jobNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHighestEdu() {
        return highestEdu;
    }

    public void setHighestEdu(String highestEdu) {
        this.highestEdu = highestEdu;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneTemp() {
        return phoneTemp;
    }

    public void setPhoneTemp(String phoneTemp) {
        this.phoneTemp = phoneTemp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getContactTemp() {
        return contactTemp;
    }

    public void setContactTemp(String contactTemp) {
        this.contactTemp = contactTemp;
    }

    public String getContactPhoneTemp() {
        return contactPhoneTemp;
    }

    public void setContactPhoneTemp(String contactPhoneTemp) {
        this.contactPhoneTemp = contactPhoneTemp;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }
}
