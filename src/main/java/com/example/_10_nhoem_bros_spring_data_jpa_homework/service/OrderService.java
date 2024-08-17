package com.example._10_nhoem_bros_spring_data_jpa_homework.service;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Order;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.OrderRequest;

public interface OrderService {
    void saveOrder(OrderRequest orderRequest);

    Order getOrderById(Long id);
}
