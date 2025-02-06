package com.example.blinkit_Clone_Product.Supply.Controller;

import com.example.blinkit_Clone_Product.Supply.Enitity.Product;
import com.example.blinkit_Clone_Product.Supply.Enum.Category;
import com.example.blinkit_Clone_Product.Supply.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductByName(@PathVariable Long id){
        return productService.getById(id);
    }

    @GetMapping("/{name}")
    public List<Product> getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @GetMapping("/{category}")
    public List<Product> getProductByCategory(@PathVariable Category category){
        return productService.getProductByCategory(category);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}