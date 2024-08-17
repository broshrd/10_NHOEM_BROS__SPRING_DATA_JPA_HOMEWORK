package com.example._10_nhoem_bros_spring_data_jpa_homework.repository;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
