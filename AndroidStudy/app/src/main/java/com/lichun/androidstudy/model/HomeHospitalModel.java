package com.lichun.androidstudy.model;

import android.view.View;
import android.widget.Toast;

public class HomeHospitalModel {
    private int image;

    public HomeHospitalModel(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "HomeHospitalModel{" +
                "image=" + image +
                '}';
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "Hospital: " + toString(), Toast.LENGTH_SHORT).show();
    }
}
