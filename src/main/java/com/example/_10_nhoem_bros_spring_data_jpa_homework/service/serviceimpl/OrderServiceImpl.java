package com.example._10_nhoem_bros_spring_data_jpa_homework.service.serviceimpl;

import com.example._10_nhoem_bros_spring_data_jpa_homework.model.Order;
import com.example._10_nhoem_bros_spring_data_jpa_homework.model.request.OrderRequest;
import com.example._10_nhoem_bros_spring_data_jpa_homework.repository.OrderRepository;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.OrderService;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;


    @Override
    public void saveOrder(OrderRequest orderRequest) {
        Order order =new Order();
//        orderRepository.save();
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }
}

