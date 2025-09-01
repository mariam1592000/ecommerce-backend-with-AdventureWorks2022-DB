package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.common.CommonConstants.APIPath;
import com.ecommerce.ecommerce_backend.dto.ProductDTO;
import com.ecommerce.ecommerce_backend.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(APIPath.Product)
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = APIPath.FindAllProduct, method = RequestMethod.GET)
    public List<ProductDTO> findAllProduct()
    {
        return productService.FindAllProduct();
    }

    @RequestMapping(value = APIPath.FindProductById, method = RequestMethod.GET)
    public ProductDTO findProductById(@RequestParam int productId)
    {
        return productService.FindProductById(productId);
    }

}
