package com.carfactory.controller;

import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.service.ProductOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/productoption")
public class ProductOptionController {
    private ProductOptionService productOptionService;

    @Autowired
    public ProductOptionController(ProductOptionService productOptionService) {
        this.productOptionService = productOptionService;
    }

    @GetMapping
    public List<ProductOption> getProductsOptions(){
        return productOptionService.getProductsOptions();
    }

    @PostMapping
    public ProductOption addProductOption(@RequestBody ProductOption productOption){
        return productOptionService.addProductOption(productOption);
    }
}
