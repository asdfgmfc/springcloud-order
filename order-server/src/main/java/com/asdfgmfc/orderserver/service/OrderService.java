package com.asdfgmfc.orderserver.service;

import com.asdfgmfc.orderserver.dto.OrderDTO;

public interface OrderService {
    OrderDTO create(OrderDTO orderDTO);
    OrderDTO finish(String orderId);
}
