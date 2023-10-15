package testautomationu.webDriver_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;

public class PremuimPage {
	
	public PremuimPage(WebDriver driver) {
		this.driver = driver; 
		
	}
	private WebDriver  driver; 
	private util.ElementActions elementActions;
	private By premiumBtn = By.id("premium-selection");
	
public void clickOnStartYourPremiumBtn() {
		
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(premiumBtn));
		elementActions.clickButton(premiumBtn);
		
	}

	

}
