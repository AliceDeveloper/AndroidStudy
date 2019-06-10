package com.lichun.androidstudy.tools;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class ImageViewAttrAdapter {

    @BindingAdapter({"src"})
    public static void setSrc(ImageView view, int resource) {
        view.setImageResource(resource);
    }
}
