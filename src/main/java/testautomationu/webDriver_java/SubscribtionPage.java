package testautomationu.webDriver_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import util.ElementActions;


public class SubscribtionPage {

	public SubscribtionPage(WebDriver driver) {
		this.driver = driver; 
	}

	private WebDriver driver;
	private util.ElementActions elementActions;
	private By liteBtn =By.id("lite-selection");
	private By classicBtn =By.id("classic-selection");
	private By premiumBtn = By.id("premium-selection");
	
	
	public void clickOnStartYourLiteBtn() {
		
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(liteBtn));
		elementActions.clickButton(liteBtn);
		
	}
	

public void  clickOnStartYourClassicBtn() {
	
	elementActions = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(classicBtn));
	elementActions.clickButton(classicBtn);
	
}

public void clickOnStartYourPremiumBtn() {
	
	elementActions = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(premiumBtn));
	elementActions.clickButton(premiumBtn);
	
}


}
