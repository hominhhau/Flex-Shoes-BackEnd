package com.flexshose.flexshoesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flexshose.flexshoesbackend.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
