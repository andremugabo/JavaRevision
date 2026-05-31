package com.andremugabo.security.controller;

import com.andremugabo.security.model.MyAppUser;
import com.andremugabo.security.service.MyAppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController // ⬅️ Combines @Controller + @ResponseBody
@RequestMapping("/req") // Base path for registration requests
@RequiredArgsConstructor
public class RegistrationController {

    private final MyAppUserService myAppUserService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping(value = "/signup", consumes = "application/json", produces = "application/json")
    public ResponseEntity<MyAppUser> registerUser(@RequestBody MyAppUser newUser) {
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        MyAppUser savedUser = myAppUserService.createUser(newUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
