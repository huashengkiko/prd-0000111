package com.deepexi.tess.service.rpc;

import com.alibaba.boot.hsf.annotation.HSFProvider;
import com.deepexi.tess.api.ProductService;
import com.deepexi.tess.domain.eo.Product;
import com.deepexi.tess.mapper.ProductMapper;
import com.deepexi.tess.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@HSFProvider(serviceInterface = ProductService.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public Object getProductList() {
        return productRepository.findAll();
    }

    public Object createProduct(Product product) {
        return productRepository.save(product);
    }

    public Object deleteProductById(Integer id) {
        productRepository.delete(id);
        return true;
    }

    public Object getProductById(Integer id) {
        return productMapper.getById(id);
    }
}