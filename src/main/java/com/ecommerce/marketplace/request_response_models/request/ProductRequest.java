package com.ecommerce.marketplace.request_response_models.request;

import lombok.NonNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProductRequest {

    @NonNull
    @Size(min=3,max=50)
    private String nameProduct;

    @NonNull
    @Size(min=10)
    private String description;

    private boolean isAvailable;

    @NonNull
    private Float price;

    @Min(0)
    private int quantity;

    @NotBlank
    private Long category;

    @NotBlank
    private byte[] productImage;
}
