package com.example._10_nhoem_bros_spring_data_jpa_homework.model.request;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String productName;
    private Float unitPrice;
    private String description;

//    create method overloading
    public Product toEntity(){
        return new Product(null,this.productName,this.unitPrice,this.description,null);
    }
    public Product toEntity(Integer id){
        return new Product(id,this.productName,this.unitPrice,this.description,null);
    }

}

