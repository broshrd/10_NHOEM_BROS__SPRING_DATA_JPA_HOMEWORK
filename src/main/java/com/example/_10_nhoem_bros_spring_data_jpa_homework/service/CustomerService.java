package com.example._10_nhoem_bros_spring_data_jpa_homework.service;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.CustomerRequest;

import java.util.Optional;

public interface CustomerService {

    Customer saveCustomer(CustomerRequest customerRequest);

    Optional<Customer> getCustomerById(Long id);


    String deleteCustomerById(Long id);

    Customer updateCustomerById(Long id, CustomerRequest customerRequest);
}
