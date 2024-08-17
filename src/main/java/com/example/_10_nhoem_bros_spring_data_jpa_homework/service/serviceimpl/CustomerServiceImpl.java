package com.example._10_nhoem_bros_spring_data_jpa_homework.service.serviceimpl;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.CreateCustomerDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.CustomerRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.repository.CustomerRepository;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(CustomerRequest customerRequest) {
        Customer customer  = customerRepository.save(customerRequest.toEntity());
    return customer;
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public String deleteCustomerById(Long id) {
       customerRepository.deleteById(id);
        return "deleted sucessfully";
    }

    @Override
    public Customer updateCustomerById(Long id, CustomerRequest customerRequest) {
        return customerRepository.save(customerRequest.toEntity(Math.toIntExact(id)));
    }
}
