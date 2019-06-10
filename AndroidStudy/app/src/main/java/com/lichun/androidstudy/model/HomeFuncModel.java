package com.lichun.androidstudy.model;

import android.view.View;
import android.widget.Toast;

public class HomeFuncModel {
    private int image;
    private String title;

    public HomeFuncModel(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "HomeFuncModel{" +
                "image=" + image +
                ", title='" + title + '\'' +
                '}';
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "Func: " + toString(), Toast.LENGTH_SHORT).show();
    }
}
