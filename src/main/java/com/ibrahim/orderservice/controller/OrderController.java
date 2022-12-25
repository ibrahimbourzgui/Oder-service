package com.ibrahim.orderservice.controller;

import com.ibrahim.orderservice.dto.OrderRequestDTO;
import com.ibrahim.orderservice.model.Order;
import com.ibrahim.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequestDTO orderRequestDTO)
    {
        orderService.placeOrder(orderRequestDTO);
        return "Order placed succefully";
    }
}
