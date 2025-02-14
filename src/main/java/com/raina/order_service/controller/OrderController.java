package com.raina.order_service.controller;

import com.raina.order_service.dto.OrderRequest;
import com.raina.order_service.model.Order;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/create")
    public String createOrder(@RequestBody OrderRequest orderRequest){

        return "Order sent successfully";
    }
}
