package com.example._10_nhoem_bros_spring_data_jpa_homework.controller;
import com.example._10_nhoem_bros_spring_data_jpa_homework.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

//    @PostMapping()
//    private Order saveOrder(@RequestBody OrderRequest orderRequest){
////       Order order = orderService.saveOrder(orderRequest);
//       return null;
//    }
//    @GetMapping("/{id}")
//    private Order getOrderById(@PathVariable Long id){
//       return orderService.getOrderById(id);
//    }

}
