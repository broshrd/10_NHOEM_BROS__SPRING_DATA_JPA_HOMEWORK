package com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Email;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
   private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private Email email;
    private List<Order> order;
}
