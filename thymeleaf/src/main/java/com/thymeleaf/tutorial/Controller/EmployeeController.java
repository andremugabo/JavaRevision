package com.thymeleaf.tutorial.Controller;


import com.thymeleaf.tutorial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {


    @GetMapping("/iteration")
    public String iteration(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@email.com"));
        employees.add(new Employee("John", "Cena", "john@email.com"));
        employees.add(new Employee("Tom", "Cruise", "tom@email.com"));
        employees.add(new Employee("Tony", "Stark", "tony@email.com"));
        employees.add(new Employee("Andre", "Mugabo", "andre@email.com"));
        model.addAttribute("employees",employees);
        return "iteration";
    }
}
