package testautomationu.webDriver_java;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static ChromeOptions option;
	protected GeneralButtons generalButtons;
	protected  SubscribtionPage subscribtionPage; 
	protected  PriceAndCurrencyValidation priceAndCurrencyValidation;

	@BeforeSuite
	public void startDriver() throws IOException {
		ChromeOptions co =new ChromeOptions();		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://subscribe.stctv.com/sa-en");
		driver.manage().window().maximize();
		
		generalButtons = new GeneralButtons(driver);
		subscribtionPage = new SubscribtionPage(driver); 
		priceAndCurrencyValidation = new PriceAndCurrencyValidation(driver);
/*
	@AfterSuite
	public void stopDriver() {

	}*/
	}
}
