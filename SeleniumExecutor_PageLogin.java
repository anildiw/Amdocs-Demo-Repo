package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor_PageLogin {

  private final WebDriver webDriver;
  private WebDriverWait wait;

  public SeleniumExecutor_PageLogin(WebDriver driver) {
    this.webDriver = driver;
    this.wait = new WebDriverWait(driver, 10); // 10 is enough
  }

  /// Page login
  public void SetLoginAndPassword(String login, String password){
   webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys(login);
   webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
  }

  public void ClickLoginSubmit(){
	  webDriver.findElement(By.xpath("//button[@id='loginButton']")).click();
  }

  public String GetToolbarAlert(){
    return null;
  }

  public boolean IsLoginButtonVisible(){
	  boolean temp=webDriver.findElement(By.xpath("//button[@id='loginButton']")).isEnabled();
	  return temp;
	  
	  
  }
}

