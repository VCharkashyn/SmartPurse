package org.example.service;

import org.example.model.User;

interface AuthService {
    boolean logIn(User user);
    boolean signUp(User user);
}
