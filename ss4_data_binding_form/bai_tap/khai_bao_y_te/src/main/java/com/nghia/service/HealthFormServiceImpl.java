package com.nghia.service;

import com.nghia.entity.HealthDeclare;
import com.nghia.repository.HealthFormRepoImpl;
import com.nghia.repository.IHealthFormRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthFormServiceImpl implements IHealthFormService {
    IHealthFormRepo healthFormRepo = new HealthFormRepoImpl();

    @Override
    public List<String> genderList() {
        return healthFormRepo.genderList();
    }

    @Override
    public List<String> nationalityList() {
        return healthFormRepo.nationalityList();
    }

    @Override
    public List<String> travelInfoList() {
        return healthFormRepo.travelInfoList();
    }

    @Override
    public Map<String, String> checkData(HealthDeclare healthDeclare) {

        Map<String, String> error = new HashMap<>();
        if (healthDeclare.getName().equals("")) {
            error.put("name", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getBirthday().equals("")) {
            error.put("birthday", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getIdCard().equals("")) {
            error.put("idCard", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getTravelInfo() == null) {
            error.put("travelInfo", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getNumberVehicle().equals("")) {
            error.put("numberVehicle", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getNumberSeat().equals("")) {
            error.put("numberSeat", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getDateStart().equals("")) {
            error.put("dateStart", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getDateEnd().equals("")) {
            error.put("dateEnd", "Bạn chưa nhập mục này");
        }
        if (healthDeclare.getOtherInfo().equals("")) {
            error.put("otherInfo", "Bạn chưa nhập mục này");
        }
        return error;
    }
}
