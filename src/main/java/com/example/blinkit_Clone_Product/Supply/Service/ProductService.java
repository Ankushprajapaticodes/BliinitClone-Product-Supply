package com.example.blinkit_Clone_Product.Supply.Service;

import com.example.blinkit_Clone_Product.Supply.Enum.Category;
import com.example.blinkit_Clone_Product.Supply.Enitity.Product;
import com.example.blinkit_Clone_Product.Supply.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getById(Long id){
        return productRepository.findById(id);
    }

    public List<Product> getProductByName(String name){
        return productRepository.findByName(name);
    }

    public List<Product> getProductByCategory(Category category){
        return productRepository.findByCategory(category);
    }

    public Product updateProduct(Long id, Product newProduct){
        return productRepository.findById(id).map(product -> {
            product.setName(newProduct.getName());
            product.setImageUrls(newProduct.getImageUrls());
            product.setUnitType(newProduct.getUnitType());
            product.setCategory(newProduct.getCategory());
            product.setKeyFeatures(newProduct.getKeyFeatures());
            product.setReturnPolicy(newProduct.getReturnPolicy());
            product.setDescription(newProduct.getDescription());
            product.setDisclaimer(newProduct.getDisclaimer());
            return productRepository.save(product);
        }).orElse(null);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


    }

