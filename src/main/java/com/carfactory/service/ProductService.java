package com.carfactory.service;

import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.repository.ProductOptionRepository;
import com.carfactory.repository.ProductRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
@Service    //same as @Component but better naming
public class ProductService {

    private ProductRepository productRepository;
    private ProductOptionRepository productOptionRepository;


    @Autowired
    public ProductService(ProductRepository productRepository, ProductOptionRepository productOptionRepository) {
        this.productRepository = productRepository;
        this.productOptionRepository = productOptionRepository;
    }

    public List<Product> getProducts(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public Product addProduct(Product product){
        if(product.getModel() == null || product.getModel().isEmpty() || product.getYear() == null || product.getYear().isEmpty()){
            throw new IllegalStateException("Missing Values");
        }
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        if(!productRepository.existsById(id)){
            throw new IllegalStateException("Product Not Found");
        }
        productRepository.deleteById(id);
    }

    public Product updateProduct(Product reqProduct, Long id){
        Optional<Product> productOptional = productRepository.findById(id);
        if(!productOptional.isPresent()){
            throw new IllegalStateException("Product Not Found");
        }
        Product product = productOptional.get();
        product.setModel(reqProduct.getModel());
        product.setYear(reqProduct.getYear());

        return productRepository.save(product);
    }

    public Product getProductById(Long id){
        Optional<Product> productOptional = productRepository.findById(id);
        if(!productOptional.isPresent()){
            throw new IllegalStateException("Product Not Found");
        }
        return productOptional.get();
    }

    public List<ProductOption> getProductOptionsByProductId(Long id){
        return productOptionRepository.findByProduct_Id(id);
    }


}
