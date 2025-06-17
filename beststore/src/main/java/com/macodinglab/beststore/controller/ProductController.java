package com.macodinglab.beststore.controller;


import com.macodinglab.beststore.models.Product;
import com.macodinglab.beststore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductsRepository repository;

    @GetMapping({"","/"})
    public String showProductList(Model model) {
        List<Product> products = repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products",products);
        return "products/index";
    }





}
