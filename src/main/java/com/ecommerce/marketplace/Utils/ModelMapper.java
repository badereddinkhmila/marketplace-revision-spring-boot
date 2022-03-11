package com.ecommerce.marketplace.Utils;

import com.ecommerce.marketplace.DTO.ProviderSummary;
import com.ecommerce.marketplace.Entity.Product;
import com.ecommerce.marketplace.Entity.User;
import com.ecommerce.marketplace.request_response_models.response.ProductResponse;

public class ModelMapper {
    public static ProductResponse mapProductToProductResponse(Product product, User provider) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setNameProduct(product.getNameProduct());
        productResponse.setDescriptionProduct(product.getDescription());
        productResponse.setPrice(product.getPrice());
        productResponse.setDiscount(product.getDiscount());
        productResponse.setAvailable(product.getQuantity()>0);

        ProviderSummary creatorSummary = new ProviderSummary(provider.getId(), provider.getUsername());
        productResponse.setProvider(creatorSummary);

        return productResponse;
    }
}
