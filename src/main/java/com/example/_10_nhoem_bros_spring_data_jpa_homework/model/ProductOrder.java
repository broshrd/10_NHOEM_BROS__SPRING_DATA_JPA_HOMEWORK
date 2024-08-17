package com.example._10_nhoem_bros_spring_data_jpa_homework.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_order")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //relation with Order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    //relation with product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer quentity;
}
