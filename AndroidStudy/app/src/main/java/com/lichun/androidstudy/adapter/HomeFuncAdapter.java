package com.lichun.androidstudy.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.lichun.androidstudy.R;
import com.lichun.androidstudy.databinding.HomeFuncLayoutBinding;
import com.lichun.androidstudy.model.HomeFuncModel;

import java.util.List;

public class HomeFuncAdapter extends BaseAdapter {
    private Context context;
    List<HomeFuncModel> funcModels;

    public HomeFuncAdapter(Context context, List<HomeFuncModel> funcModels) {
        this.context = context;
        this.funcModels = funcModels;
    }

    @Override
    public int getCount() {
        return funcModels.size();
    }

    @Override
    public Object getItem(int position) {
        return funcModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HomeFuncLayoutBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.home_func_layout, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }
        binding.setModel(funcModels.get(position));
        return binding.getRoot();
    }
}