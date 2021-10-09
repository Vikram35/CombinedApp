package com.choudhary.combinedapk;

public class Model {

    String name,bloodType,addrress;

    public Model(String name, String bloodType, String addrress) {
        this.name = name;
        this.bloodType = bloodType;
        this.addrress = addrress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAddrress() {
        return addrress;
    }

    public void setAddrress(String addrress) {
        this.addrress = addrress;
    }
}
