package com.graduation.hrApi.entities.base;

import java.io.Serializable;

public class AnAbility implements Serializable {
    private String userName;
    private double communicate;
    private double administration;
    private double team;
    private double develop;
    private double efficiency;

    public AnAbility(){}

    public AnAbility(String userName, double communicate, double administration, double team, double develop, double efficiency) {
        this.userName = userName;
        this.communicate = communicate;
        this.administration = administration;
        this.team = team;
        this.develop = develop;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "AnAbility{" +
                "userName='" + userName + '\'' +
                ", communicate=" + communicate +
                ", administration=" + administration +
                ", team=" + team +
                ", develop=" + develop +
                ", efficiency=" + efficiency +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getCommunicate() {
        return communicate;
    }

    public void setCommunicate(double communicate) {
        this.communicate = communicate;
    }

    public double getAdministration() {
        return administration;
    }

    public void setAdministration(double administration) {
        this.administration = administration;
    }

    public double getTeam() {
        return team;
    }

    public void setTeam(double team) {
        this.team = team;
    }

    public double getDevelop() {
        return develop;
    }

    public void setDevelop(double develop) {
        this.develop = develop;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
}
