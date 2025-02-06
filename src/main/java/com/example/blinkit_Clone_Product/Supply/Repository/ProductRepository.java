package com.example.blinkit_Clone_Product.Supply.Repository;

import com.example.blinkit_Clone_Product.Supply.Enum.Category;
import com.example.blinkit_Clone_Product.Supply.Enitity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    //find by name se
    List<Product> findByName(String name);

    //find by category se
    List<Product> findByCategory(Category category);


}
