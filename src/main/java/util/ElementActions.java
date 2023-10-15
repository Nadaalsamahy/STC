package util;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class ElementActions {
	private WebDriver driver;
	private WaitElements waitElements;
	private Actions actions;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickButton(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
	    waitElements.waitPresenceOfAllElementsLocatedBy(element);
		waitElements.waitClickabilityOfElement(element);
		driver.findElement(element).click();
		
	}
	
	public void MoveTo(By element) {
		
		WebElement webelement =  driver.findElement(element);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", webelement); 
	}
	
	public void typeValue(By element, String elementValue) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		waitElements.waitClickabilityOfElement(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(elementValue);
	
		System.out.println(elementValue);
}
	public String getElementText(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		return driver.findElement(element).getText();
	}

	}
