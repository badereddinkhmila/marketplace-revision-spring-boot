package com.ecommerce.marketplace.Service;

import com.ecommerce.marketplace.Entity.Product;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.query.dsl.QueryBuilder;

import java.util.List;

public class SearchService implements SearchServiceInterface{
    @Override
    public FullTextQuery getJpaQuery() {
        return null;
    }

    @Override
    public QueryBuilder getQueryBuilder() {
        return null;
    }

    @Override
    public List<Product> searchProductByKeyWordQuery() {
        return null;
    }

    @Override
    public List<Product> searchProductByFuzzyQuery() {
        return null;
    }

    @Override
    public List<Product> searchProductDescriptionByPhraseQuery() {
        return null;
    }

    @Override
    public List<Product> searchProductNameByRangeQuery() {
        return null;
    }

    @Override
    public List<Product> searchProductDescriptionAndNameBySimpleStringQuery() {
        return null;
    }

    @Override
    public List<Product> searchProducts() {
        return null;
    }

    @Override
    public List<Product> getSuggestions() {
        return null;
    }

    @Override
    public List<Product> priceFacets() {
        return null;
    }
}
