package com.nghia.repository;

import java.util.ArrayList;
import java.util.List;

public class HealthFormRepoImpl implements IHealthFormRepo{
    static List<String> genderList = new ArrayList<>();
    static List<String> nationalityList = new ArrayList<>();
    static List<String> travelInfoList = new ArrayList<>();
    static {
        genderList.add("Nam");
        genderList.add("Nữ");

        nationalityList.add("Việt Nam");
        nationalityList.add("Lào");
        nationalityList.add("Thái Lan");
        nationalityList.add("Campuchia");
        nationalityList.add("Trung Quốc");
        nationalityList.add("Maplaysia");

        travelInfoList.add("Tàu bay");
        travelInfoList.add("Tàu thuyền");
        travelInfoList.add("Ô tô");
        travelInfoList.add("Khác (ghi rõ)");
    }
    @Override
    public List<String> genderList() {
        return genderList;
    }

    @Override
    public List<String> nationalityList() {
        return nationalityList;
    }

    @Override
    public List<String> travelInfoList() {
        return travelInfoList;
    }
}
