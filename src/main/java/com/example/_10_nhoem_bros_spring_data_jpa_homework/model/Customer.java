package com.example._10_nhoem_bros_spring_data_jpa_homework.model;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.CreateCustomerDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.CustomerDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "customer_name")
    private String Name;
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;

    //relationship with email
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id")
    private Email email;

    //relationship with order
    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;

    public Customer(Integer customerId, String customerName, String address, String phoneNumber, String email, Object orderList) {
    }
    public CustomerDTO toRespone(){
        return new CustomerDTO(this.customerId,this.Name,this.address,this.phoneNumber,this.email,this.orderList);
    }

}
