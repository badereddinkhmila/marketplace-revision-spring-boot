package com.ecommerce.marketplace.request_response_models.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PagedResponse<T> {
    private List<T> content;
    private int page;
    private int size;
    private Long totalElements;
    private int totalPages;
    private boolean last;

}
