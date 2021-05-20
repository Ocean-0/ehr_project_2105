package com.graduation.hrApi.entities.base;

import java.io.Serializable;

public class AnSex implements Serializable {
    private int man;
    private int woman;
    public void AnSex(){}

    public AnSex(int man, int woman) {
        this.man = man;
        this.woman = woman;
    }

    @Override
    public String toString() {
        return "AnSex{" +
                "man=" + man +
                ", woman=" + woman +
                '}';
    }

    public int getMan() {
        return man;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public int getWoman() {
        return woman;
    }

    public void setWoman(int woman) {
        this.woman = woman;
    }
}
