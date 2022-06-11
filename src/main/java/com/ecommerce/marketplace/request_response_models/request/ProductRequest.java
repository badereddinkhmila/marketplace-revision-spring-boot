package com.ecommerce.marketplace.request_response_models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotNull
    @Size(min = 3, max = 50)
    private String nameProduct;

    @NotNull
    @Size(min = 10)
    private String description;

    private boolean isAvailable;

    @NotNull
    private Float price;

    @Min(0)
    private int quantity;

    @NotNull
    private Long categoryId;
}
