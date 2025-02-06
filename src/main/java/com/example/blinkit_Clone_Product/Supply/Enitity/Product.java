package com.example.blinkit_Clone_Product.Supply.Enitity;

import com.example.blinkit_Clone_Product.Supply.Enum.Category;
import com.example.blinkit_Clone_Product.Supply.Enum.Unit_Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Product_Name",nullable = false)
    private String name;

    @ElementCollection  // kai saari images ke link store karne ke liye
    private List<String> imageUrls;

    @Enumerated(EnumType.STRING) // ek dropdown type bana sake
    @Column(nullable = false)
    private Unit_Type unitType;

    @Enumerated(EnumType.STRING)  // ek dropdown type bana sake
    @Column(nullable = false)
    private Category category;

    @Column(length = 500)
    private String keyFeatures;

    @Column(length = 500)
    private String returnPolicy;

    @Column(length = 1000)
    private String description;

    @Column(length = 500)
    private String disclaimer;

    // Default constructor
    public Product() {}

    // Getters and Setters - updated for consistency with field names
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Unit_Type getUnitType() {
        return unitType;
    }

    public void setUnitType(Unit_Type unitType) {
        this.unitType = unitType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getKeyFeatures() {
        return keyFeatures;
    }

    public void setKeyFeatures(String keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }
}
