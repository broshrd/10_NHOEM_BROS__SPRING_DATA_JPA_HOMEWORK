package com.example._10_nhoem_bros_spring_data_jpa_homework.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_tb")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    @Column(name = "order_date")
    private LocalDateTime orderDate = LocalDateTime.now();
    @Column(name = "total_amount")
    private Float totalAmount;

    //using enum for status
    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;

    //relation with Customer
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //relation with product_order
    @OneToMany(mappedBy = "order")
    private List<ProductOrder> productOrders;
}
