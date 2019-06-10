package com.lichun.androidstudy.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.lichun.androidstudy.R;
import com.lichun.androidstudy.databinding.HomeDoctorLayoutBinding;
import com.lichun.androidstudy.model.HomeDoctorModel;

import java.util.List;

public class HomeDoctorAdapter extends BaseAdapter {
    private Context context;
    List<HomeDoctorModel> doctorModels;

    public HomeDoctorAdapter(Context context, List<HomeDoctorModel> doctorModels) {
        this.context = context;
        this.doctorModels = doctorModels;
    }

    @Override
    public int getCount() {
        return doctorModels.size();
    }

    @Override
    public Object getItem(int position) {
        return doctorModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HomeDoctorLayoutBinding binding;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.home_doctor_layout, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }
        binding.setModel(doctorModels.get(position));
        return binding.getRoot();
    }
}
