package com.ueag.auth.service;

import com.ueag.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
