package com.thymeleaf.tutorial.Controller;


import com.thymeleaf.tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UseController {

    @GetMapping("/if-unless")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Ramesh","ramesh@email.com","ADMIN"));
        users.add(new User("Tom","TOM@email.com","USER"));
        users.add(new User("John","john@email.com","USER"));
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public  String switchExample(Model model){
        User user = new User("Ramesh", "ramesh@email.com", "ADMIN");
        model.addAttribute("user",user);
        return "switch-case";
    }
}
