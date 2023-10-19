package com.boniewijaya2021.springboot.service;

import com.boniewijaya2021.springboot.entity.Salesman;
import com.boniewijaya2021.springboot.repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesmanService {
    @Autowired
    private SalesmanRepository salesmanRepository;

    public List<Salesman> getAllSalesmen() {
        return salesmanRepository.findAll();
    }

    public Salesman createSalesman(Salesman salesman) {
        return salesmanRepository.save(salesman);
    }
}
