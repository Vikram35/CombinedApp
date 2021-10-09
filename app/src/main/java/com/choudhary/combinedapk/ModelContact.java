package com.choudhary.combinedapk;

public class ModelContact {

    String name , phone , email , adrress, imageurl;

    public ModelContact(String name, String phone, String email, String adrress, String imageurl) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adrress = adrress;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
