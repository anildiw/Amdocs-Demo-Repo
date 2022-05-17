package com.devskiller.selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor_PageProducts {

  private final WebDriver webDriver;
  private WebDriverWait wait;

  public SeleniumExecutor_PageProducts(WebDriver driver) {
    this.webDriver = driver;
    this.wait = new WebDriverWait(driver, 10); // 10 is enough
  }

  // Open add new product form by '+'
  public void OpenAddNewProductForm(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  // Return all available categories from Category dropdown
  public List<String> GetCategoriesFromAddNewProductForm(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  // Scroll down to load next set of values. 20 additional items are loaded on single scroll 
  public void AddNewProductForm_Categories_ScrollDown(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  //Method to add new product: Open add new form, fill fields, click Create
  public void AddNewProduct(
    String name, 
    String category, 
    String description, 
    String price, 
    String quantity,
    String pathToFile){
    OpenAddNewProductForm();
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  // Return all available products from the products table.
  public List<ProductModel> GetAllProducts(){
    return null; // implement this method
  }

  // Run downloading image based on the provided ProductModel object
  public void DownloadImage(ProductModel productModel){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  // Do hover over button, based by button name
  public void HoverOverButton(String buttonName){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  // Get active tooltip text, as a result of a hovered button
  public String GetActiveTooltipText(){
    return null; // implement this method
  }

  //Return name of the new file - only one will be downloaded
  public String GetDownloadedFileName(String downloadFolderPath){
    return null; // implement this method
  }
}

