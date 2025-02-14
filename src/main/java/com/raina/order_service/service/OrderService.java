package com.raina.order_service.service;

import com.raina.order_service.dto.OrderRequest;
import com.raina.order_service.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order createOrder(OrderRequest or){
        Order od = new Order();
        //od.setOrderNumber(or.);
        return null;
    }
}
