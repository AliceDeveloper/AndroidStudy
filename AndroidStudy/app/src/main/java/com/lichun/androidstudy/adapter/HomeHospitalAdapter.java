package com.lichun.androidstudy.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.lichun.androidstudy.R;
import com.lichun.androidstudy.databinding.HomeHospitalItemBinding;
import com.lichun.androidstudy.model.HomeHospitalModel;

import java.util.List;

public class HomeHospitalAdapter extends RecyclerView.Adapter<HomeHospitalAdapter.HospitalViewHolder> {
    private Context context;
    private List<HomeHospitalModel> hospitalModels;

    public HomeHospitalAdapter(Context context, List<HomeHospitalModel> hospitalModels) {
        this.context = context;
        this.hospitalModels = hospitalModels;
    }

    @Override
    public HospitalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeHospitalItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.home_hospital_item, parent, false);
        return new HospitalViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(HospitalViewHolder holder, int position) {
        HomeHospitalItemBinding binding = holder.binding;
        binding.setModel(hospitalModels.get(position));
        binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return hospitalModels.size();
    }

    class HospitalViewHolder extends RecyclerView.ViewHolder {
        HomeHospitalItemBinding binding;

        HospitalViewHolder(HomeHospitalItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
