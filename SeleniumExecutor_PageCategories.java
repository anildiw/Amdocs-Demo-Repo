package com.devskiller.selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor_PageCategories {

  private final WebDriver webDriver;
  private WebDriverWait wait;

  public SeleniumExecutor_PageCategories(WebDriver driver) {
    this.webDriver = driver;
    this.wait = new WebDriverWait(driver, 10); // 10 is enough
  }

  // Page category
  public void SearchCategory(String search){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  public boolean IsCategoryVisibleOnCategories(String name){
    return false; // implement this method
  }

  public List<String> GetAllCategoriesNames(){
    return null; // implement this method
  }

  public void ModifyCategory(String name, String newName){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  /// returning message of the allert
  public String DeleteSingleCategoryByNameAndAccept(String name){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  public void ClickPaginationNextPage(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  public void ClickPaginationFirstPage(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }
}

