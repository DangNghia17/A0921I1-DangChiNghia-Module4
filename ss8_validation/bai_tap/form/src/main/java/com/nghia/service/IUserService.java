package com.nghia.service;

import com.nghia.entity.User;

import java.util.List;

public interface IUserService {
    List<User> fillAll();

    void save(User user);
}
