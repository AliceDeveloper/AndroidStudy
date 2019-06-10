package com.lichun.androidstudy.model;

import android.view.View;
import android.widget.Toast;

public class HomeDoctorModel {
    /**
     * 头像、医生姓名、医生职位、医生擅长领域、所在医院、浏览量
     */
    private int image;
    private String name;
    private String position;
    private String expert;
    private String hospital;
    private String viewCount;

    public HomeDoctorModel(int image, String name, String position, String expert, String hospital, String viewCount) {
        this.image = image;
        this.name = name;
        this.position = position;
        this.expert = expert;
        this.hospital = hospital;
        this.viewCount = viewCount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "HomeDoctorModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", expert='" + expert + '\'' +
                ", hospital='" + hospital + '\'' +
                ", viewCount='" + viewCount + '\'' +
                '}';
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "Doctor: " + toString(), Toast.LENGTH_SHORT).show();
    }
}
