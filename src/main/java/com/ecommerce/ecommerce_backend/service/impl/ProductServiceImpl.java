package com.ecommerce.ecommerce_backend.service.impl;


import com.ecommerce.ecommerce_backend.dto.ProductDTO;
import com.ecommerce.ecommerce_backend.model.production.Product;
import com.ecommerce.ecommerce_backend.repository.ProductRepository;
import com.ecommerce.ecommerce_backend.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {


    final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> FindAllProduct() {

        return productRepository.findAll()
                .stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO FindProductById(int productId) {

        Optional<Product> product = productRepository.findByProductID(productId);
        return product.map(ProductDTO::new).orElse(null);
    }

    @Override
    public List<ProductDTO> findByProductCategoryID(int productCategoryId) {

        List<Product> productList = productRepository.findByProductCategoryID(productCategoryId);
        if(!productList.isEmpty())
        {
            return productList
                    .stream()
                    .map(ProductDTO::new)
                    .collect(Collectors.toList());
        }
        return null;
    }

}
