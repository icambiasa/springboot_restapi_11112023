package com.boniewijaya2021.springboot.repository;

import com.boniewijaya2021.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
