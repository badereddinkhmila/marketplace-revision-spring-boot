package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.Entity.Order;

public interface OrderServiceInterface {
    Iterable<Order> getAllOrders();
    Order create();
    void update();
}
