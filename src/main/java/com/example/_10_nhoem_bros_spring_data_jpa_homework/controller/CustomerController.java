package com.example._10_nhoem_bros_spring_data_jpa_homework.controller;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.CreateCustomerDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.CustomerRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.ProductRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.CustomerService;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    private Customer saveCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = customerService.saveCustomer(customerRequest);
        return customer;
    }
    @GetMapping("/{id}")
    private Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomerById(id);

    }
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,@RequestBody CustomerRequest customerRequest){
        return customerService.updateCustomerById(id,customerRequest);
    }

}
