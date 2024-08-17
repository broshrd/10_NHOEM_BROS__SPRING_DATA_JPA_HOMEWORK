package com.example._10_nhoem_bros_spring_data_jpa_homework.service;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.CustomerRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.ProductRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {


    List<Product> getAllProducts(Pageable pageable);

    ProductDTO saveProduct(ProductRequest productRequest);

    Optional<Product> getProductById(Long id);

    String deleteProduct(Long id);

    Product updateProduct(Long id, ProductRequest productRequest);

    List<Product> getAllProduct(Pageable pageable);
}
