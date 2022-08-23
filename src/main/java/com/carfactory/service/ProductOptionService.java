package com.carfactory.service;

import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.repository.ProductOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductOptionService {

    private ProductOptionRepository productOptionRepository;

    @Autowired
    public ProductOptionService(ProductOptionRepository productOptionRepository) {
        this.productOptionRepository = productOptionRepository;
    }

    public List<ProductOption> getProductsOptions(){
        return productOptionRepository.findAll();
    }


    public ProductOption addProductOption(ProductOption productOption){
        System.out.println(productOption);
        return productOptionRepository.save(productOption);
    }

}
