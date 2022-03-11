package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.Entity.Product;

import java.util.List;

public interface CrudProductServiceInterface {
    Product save();
    Product deleteProduct();
    Product getProductById();
    List<Product> getProductByProvider();
    List<Product> getProductByCategoryId();
}
