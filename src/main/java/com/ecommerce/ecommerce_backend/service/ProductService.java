package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDTO> FindAllProduct();

    ProductDTO FindProductById(int productCategoryId);

    List<ProductDTO> findByProductCategoryID(int productCategoryId);
}
