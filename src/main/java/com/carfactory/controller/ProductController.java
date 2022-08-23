package com.carfactory.controller;

import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping(
            path = "{productId}"
    )
    public void deleteProduct(@PathVariable("productId") Long id){
        productService.deleteProduct(id);
    }

    @PutMapping(
            path = "{productId}"
    )
    public Product updateProduct(@RequestBody Product product, @PathVariable("productId") Long id){
        return productService.updateProduct(product, id);
    }

    @GetMapping(
            path = "{productId}"
    )
    public Product getProduct(@PathVariable("productId") Long id){
        return productService.getProductById(id);
    }

    @GetMapping(
            path = "{productId}/productoption"
    )
    public List<ProductOption> getProductOptionsByProductId(@PathVariable("productId") Long id){
        return productService.getProductOptionsByProductId(id);
    }

}
