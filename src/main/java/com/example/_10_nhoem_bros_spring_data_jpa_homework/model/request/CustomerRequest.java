package com.example._10_nhoem_bros_spring_data_jpa_homework.model.request;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Customer;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.CreateCustomerDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Email;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private String customerName;
    private String address;
    private String phoneNumber;
    private String email;
    public Customer toEntity(){
        return new Customer(null,this.customerName,this.address,this.phoneNumber,this.email,null);
    }
    public Customer toEntity(Integer id){
        return new Customer(id,this.customerName,this.address,this.phoneNumber,this.email,null);
    }
}
