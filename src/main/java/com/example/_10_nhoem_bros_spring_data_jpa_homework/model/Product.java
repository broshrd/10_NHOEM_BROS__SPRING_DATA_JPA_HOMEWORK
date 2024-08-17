package com.example._10_nhoem_bros_spring_data_jpa_homework.model;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.DTO.ProductDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private Float unitPrice;
    private String description;

    //relation with product_order
    @OneToMany(mappedBy = "product")
    private List<ProductOrder> productOrders;

    public ProductDTO toRespone(){
        return new ProductDTO(this.productId,this.productName,this.unitPrice,this.description);
    }
}
