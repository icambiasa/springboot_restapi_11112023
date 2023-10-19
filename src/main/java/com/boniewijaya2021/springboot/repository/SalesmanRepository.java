package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
}
