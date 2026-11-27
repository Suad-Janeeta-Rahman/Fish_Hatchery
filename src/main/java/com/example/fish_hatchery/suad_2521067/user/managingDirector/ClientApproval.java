package com.example.fish_hatchery.suad_2521067.user.managingDirector;

import com.sun.org.apache.xpath.internal.objects.XString;

public class ClientApproval {
    private String name;
    private String phone;
    private String district;
    private boolean approved;

    public ClientApproval(String name, String phone, String district, boolean approved) {
        this.name = name;
        this.phone = phone;
        this.district = district;
        this.approved = approved;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDistrict() {
        return district;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "ClientApproval{" +
                "approved=" + approved +
                ", district='" + district + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
