package com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
  private Integer id;
    private Date orderDate;
    private Float totalAmount;
    private String status;
    private Enum anEnum;
    private List<Product> product;

}
