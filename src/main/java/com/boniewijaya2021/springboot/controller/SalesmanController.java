package com.boniewijaya2021.springboot.controller;

import com.boniewijaya2021.springboot.entity.Salesman;
import com.boniewijaya2021.springboot.service.SalesmanService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salesmen")
public class SalesmanController {
    @Autowired
    private SalesmanService salesmanService;

    @GetMapping
    public List<Salesman> getAllSalesmen() {
        return salesmanService.getAllSalesmen();
    }

    @PostMapping
    public Salesman createSalesman(@RequestBody Salesman salesman) {
        return salesmanService.createSalesman(salesman);
    }
}
