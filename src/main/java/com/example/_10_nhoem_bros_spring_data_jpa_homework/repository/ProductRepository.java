package com.example._10_nhoem_bros_spring_data_jpa_homework.repository;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepository extends JpaRepository<Product,Long> {

}
