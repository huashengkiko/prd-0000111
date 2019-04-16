package com.deepexi.tess.api;

import com.deepexi.tess.domain.eo.Product;

public interface ProductService {

    Object getProductList();

    Object getProductById(Integer id);

    Object createProduct(Product product);

    Object deleteProductById(Integer id);

}
