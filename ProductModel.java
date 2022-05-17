package com.devskiller.selenium;

import org.openqa.selenium.WebElement;

public class ProductModel {
    public String id;
    public String name;
    public String category;
    public String description;
    public String price;
    public String quantity;
    public WebElement image;
    public WebElement thumbnail;

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }
    
    public String getPrice(){
        return price;
    }

    public String getQuantity(){
        return quantity;
    }
}
