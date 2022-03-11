package com.ecommerce.marketplace.DTO;

import com.ecommerce.marketplace.Entity.Order;
import com.ecommerce.marketplace.Entity.Role;

import java.util.List;

public class UserDTO {
    private String username;
    private String email;
    private List<Role> roles;
    private List<Order> orders;
}
