package com.example._10_nhoem_bros_spring_data_jpa_homework.repository;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    Customer save(Customer entity, Long id);
}
