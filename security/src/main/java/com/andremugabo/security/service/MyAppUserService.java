package com.andremugabo.security.service;

import com.andremugabo.security.model.MyAppUser;

public interface MyAppUserService {
    MyAppUser findUseByEmail(String email);
    MyAppUser createUser(MyAppUser theMyappUser);
}
