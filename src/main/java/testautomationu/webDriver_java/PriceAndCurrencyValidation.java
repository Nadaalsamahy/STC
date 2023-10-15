package testautomationu.webDriver_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementActions;

public class PriceAndCurrencyValidation {
	
	public PriceAndCurrencyValidation(WebDriver driver) {
		this.driver = driver; 
	}
		// TODO Auto-generated constructor stub
	
	public WebDriver driver; 
	ElementActions elementActions;
	
	private By totalPrice = By.xpath("//span[@class='total-price' and @id='order-tier-price']");
	private By clickStc = By.id("stc-price");
	private By esportPrice = By.xpath("//div[@class='price'][1]");
	private By shahedPrice = By.xpath("(//div[@class='price'])[2]");
	private By fightBhrPrice =By.xpath("(//div[@class='price'])[2]");
	private By shahedVIPPrice = By.xpath("(//div[@class='price'])[3]");
	private By fightprice = By.xpath("(//div[@class='price'])[4]");
	private By totalChanelPrice =By.xpath("(//span[@class='total-price' and @id='order-tier-price'])");
	private By STCBHR = By.id("vb-price");
	private By STCKW = By.id("vk-price");
	private By totalChanelPrice2 = By.id("order-total-price");
	private By visaKW = By.id("cc_kuw-price");

	public String getTotalPriceTitle() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(totalPrice);
	}

	public String getTotalChanelPrice2() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(totalChanelPrice2);
	}
	public String getTitleSTCAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(clickStc);
	}
	public String getBHTitleSTCAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(STCBHR);
	}
	public String getKWTitleSTCAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(STCKW);
	}
	
	public String getEsportKSAPriceAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(esportPrice);
	}
	public String getShahedKSAPriceAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(shahedPrice);
	}
	public String getShahedVIPriceAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(shahedVIPPrice);
	}
	public String getFightPriceAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(fightprice);
	}
	public String getFightPriceAndCurrencyBHR() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(fightBhrPrice);
	}
	public String getTotalChanelPriceAndCurrency() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(totalChanelPrice);
	}
	
	public String getTitleVisaKW() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(visaKW);
	}
	
	

}
