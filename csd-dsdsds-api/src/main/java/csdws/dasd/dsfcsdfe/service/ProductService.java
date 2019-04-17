package csdws.dasd.dsfcsdfe.service;

import com.deepexi.util.pageHelper.PageBean;
import csdws.dasd.dsfcsdfe.domain.eo.Product;

public interface ProductService {

    PageBean getProductList(Integer page, Integer size, Integer price);

    Product getProductById(String id);

    Integer createProduct(Product product);

    Boolean deleteProductById(String id);

    void testError();
}
