package org.example.service;

import org.example.model.User;

public class AuthServiceImpl implements AuthService {

    @Override
    public boolean logIn(User user) {
        return false;
    }

    @Override
    public boolean signUp(User user) {
        return false;
    }

    @Override
    public boolean isExist(User user) {
        return false;
    }

}
