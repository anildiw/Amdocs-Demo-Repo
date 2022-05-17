package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor_PageHome {

	private final WebDriver webDriver;
	private WebDriverWait wait;

	public SeleniumExecutor_PageHome(WebDriver driver) {
		this.webDriver = driver;
		this.wait = new WebDriverWait(driver, 10); // 10 is enough
	}

	// Toolbars
	public String GetPageTitle() {
		return webDriver.getTitle();

	}

	public String GetToolbarAlert() {
		String alert = webDriver.findElement(By.xpath("//div[text()[contains(.,'unsuccessful')]]")).getText();
		return alert;
	}

	public void ClickLogout() {
		webDriver.findElement(By.xpath("//button[@id='logoutBtn']")).click();
	}

	// Return new window id
	@SuppressWarnings({ "unused", "null" })
	public String ClickDevskillerComLink() {
		WebDriver driver = null;
		String originalWindow = driver.getWindowHandle();
		webDriver.findElement(By.xpath("//a[@href='https://devskiller.com/']")).click();

		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}

		}

		return null;
	}

	public boolean VerifyDevskillerComLogoIsVisible(String windowId) {
		return false; // implement this method
	}

	public void CloseNewPageAndReturnToTestPage() {
		throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
	}

	public void OpenCategories() {
		throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
	}

	public void OpenProducts() {
		throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
	}

	public void OpenUserTypes() {
		throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
	}

	public void StopTillProgressBarIsVisible() {
		// Use cssSelector "div[role=progressbar]". Be aware that this element is
		// showing up with a delay
		throw new org.apache.commons.lang3.NotImplementedException("Implement this method");
	}

	public String GetDateFromHomePage() {
		WebElement date = webDriver.findElement(By.xpath("//h3[@id='currDateBottom']"));
		return date.getText();
	}

	public String GetDateFromBottom() {
		WebElement dateBtm = webDriver.findElement(By.xpath("//h3[@id='currDateBottom']"));
		return dateBtm.getText();

	}
}
