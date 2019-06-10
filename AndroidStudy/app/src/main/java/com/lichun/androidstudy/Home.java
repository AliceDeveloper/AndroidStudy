package com.lichun.androidstudy;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.lichun.androidstudy.adapter.HomeDoctorAdapter;
import com.lichun.androidstudy.adapter.HomeFuncAdapter;
import com.lichun.androidstudy.adapter.HomeHospitalAdapter;
import com.lichun.androidstudy.model.HomeDoctorModel;
import com.lichun.androidstudy.model.HomeFuncModel;
import com.lichun.androidstudy.model.HomeHospitalModel;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    private View homeView;
    List<HomeFuncModel> funcModels = new ArrayList<>();
    List<HomeHospitalModel> hospitalModels = new ArrayList<>();
    List<HomeDoctorModel> doctorModels = new ArrayList<>();

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeView = LayoutInflater.from(getContext()).inflate(R.layout.activity_home, null);
        initData();
        return homeView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private void initData() {
        funcModels.add(new HomeFuncModel(R.mipmap.home_yygh, "预约挂号"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_jkda, "健康档案"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_ycfbj, "健康宝妈"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_mb, "慢病管理"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_zbjs, "指标解释"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_etbj, "疾病库"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_ypcx, "药品查询"));
        funcModels.add(new HomeFuncModel(R.mipmap.home_cxbg, "查询报告"));

        hospitalModels.add(new HomeHospitalModel(R.mipmap.home_yy1));
        hospitalModels.add(new HomeHospitalModel(R.mipmap.home_yy2));
        hospitalModels.add(new HomeHospitalModel(R.mipmap.home_yy1));
        hospitalModels.add(new HomeHospitalModel(R.mipmap.home_yy2));

        doctorModels.add(new HomeDoctorModel(R.mipmap.home_yygh, "周丽丽", "主任医生", "擅长：血液疾病诊治，尤其在缺铁性贫性贫病，血液疾病诊治，尤其在缺铁性贫性贫病", "四川省人民医院", "1234"));
    }

    private void initView() {

        EditText search = homeView.findViewById(R.id.home_search);
        // 不显示光标
        search.setCursorVisible(false);
        search.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    Toast.makeText(getContext(), "搜索", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        GridView gridView = homeView.findViewById(R.id.home_func_gridView);
        gridView.setAdapter(new HomeFuncAdapter(getContext(), funcModels));

        RecyclerView recyclerView = homeView.findViewById(R.id.home_hospital_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        HomeHospitalAdapter homeHospitalAdapter = new HomeHospitalAdapter(getContext(), hospitalModels);
        recyclerView.setAdapter(homeHospitalAdapter);

        ListView listView = homeView.findViewById(R.id.home_doctor_listView);
        listView.setAdapter(new HomeDoctorAdapter(getContext(), doctorModels));
    }
}
