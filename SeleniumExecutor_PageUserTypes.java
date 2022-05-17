package com.devskiller.selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor_PageUserTypes {

  private final WebDriver webDriver;
  private WebDriverWait wait;

  public SeleniumExecutor_PageUserTypes(WebDriver driver) {
    this.webDriver = driver;
    this.wait = new WebDriverWait(driver, 10); // 10 is enough
  }

  //Page User types
  public void OpenAddNewPermissionForm(){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }

  public List<PermissionModel> GetAllPermisions(){
    return null; // implement this method
  }

  //mark true - checked, mark false - unchecked
  public void MarkUnmarkPermission(String permissionName, boolean mark){
    throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
  }
}

