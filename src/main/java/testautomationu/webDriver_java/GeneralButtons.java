package testautomationu.webDriver_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;

public class GeneralButtons {

	private WebDriver driver;
	ElementActions elementActions;
	public GeneralButtons (WebDriver driver) {
		this.driver = driver; 
	}
	
	private By choosePaymentMethodBtn =By.xpath("//button[@id='btnChoosePaymentMethod' and @class='hide-mobile button ']");
	private By eSportBtn = By.xpath("//label[@class='card-footer '][1]"); 
	private By chooseAddonsBtn = By.xpath("//button[@id='btnChooseAddons' and @class='hide-mobile button ']"); 
	private By countryNameBtn =By.xpath("//div[@class='country-current']"); 
	private By clickStc = By.id("stc-price");
	private By visaKSA = By.id("cc_ksa-container");
	private By visaKW = By.id("cc_kuw-container");

	private By shahid = By.xpath("(//label[@class='card-footer '])[2]");
	private By shahidVIP = By.xpath("(//label[@class='card-footer '])[3]");
	private By fightBtn = By.xpath("(//label[@class='card-footer '])[4]");
	private By finalStepSubscribeBtn = By.xpath("//button[@id='btnFinalStepSubscribe' and @class='hide-mobile button ']");
	private By mobileNum = By.xpath("//input[@type='text' and @autocomplete='off' and @placeholder='Mobile number']");
	private By email = By.id("readonlyEmail");
	private By password = By.id("readonlyPassword");
	private By SaudiBtn = By.xpath("//a[@id='sa']");
	private By KwiatBtn = By.xpath("//a[@id='kw']");
	private By BahrainBtn = By.xpath("//a[@id='bh']");
	private By successMessage=By.xpath("//div[@class='thankyou-desc']");
	private By subsecribe = By.xpath("(//button[@class='button compact'])[2]");
	private By pinConfirmation = By.xpath("//div[@class='confirm-form']");
	private By CardHolderName = By.xpath("//input[@id='card_holder_name' ]");
	private By cardNumber=By.xpath("//input[@id='card_number' ]");
	private By expiryMonth=By.xpath("//input[@id='expiry_month']");
	private By expiryYear=By.xpath("//input[@id='expiry_year']");
	private By CVV=By.xpath("//input[@id='card_security_code']");
	//input[@id='card_security_code']
	private By submit=By.xpath("//button[@class='form-btn']");



	
	public void clickCountryBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(countryNameBtn));
		elementActions.clickButton(countryNameBtn);
		
	}
	public void clickSaudiBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(SaudiBtn));
		elementActions.clickButton(SaudiBtn);
		//return subscribtionPage = new SubscribtionPage(driver);
	}
	
	public void clickBahrainBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(BahrainBtn));
		elementActions.clickButton(BahrainBtn);
	}
	public void clickkwaitBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(KwiatBtn));
		elementActions.clickButton(KwiatBtn);
	}
	
	public void clickOnChoosePaymentMethodBtn(){
	elementActions = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(choosePaymentMethodBtn));
	elementActions.clickButton(choosePaymentMethodBtn);
	
}
	public void clickOnesportBtn(){
	elementActions = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(eSportBtn));
	elementActions.clickButton(eSportBtn);
	}
	
	
	public void clickOnchooseAddOnBtn(){
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chooseAddonsBtn));
		elementActions.clickButton(chooseAddonsBtn);
		}

	public void clickfightBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fightBtn));
		elementActions.clickButton(fightBtn);
	}

	public void typeMobileNumber(String mobileeNumberData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(mobileNum, mobileeNumberData);
	}
	public void typeEmail(String emailData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(email, emailData);
	}
	public void typePassword(String passwordData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(password, passwordData);
	}
	public void typeCardHolderName(String cardNameData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(CardHolderName, cardNameData);
	}
	public void typeCardNumber(String cardNumberData) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(cardNumber, cardNumberData);
	}
	
	public void typeExpireMonth(String cardExpireMonth) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(expiryMonth, cardExpireMonth);
	}
	public void typeExpireYear(String cardExpireYear) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(expiryYear, cardExpireYear);
	}
	public void typeCVV(String cardCVV) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(CVV, cardCVV);
	}
	
	public void clickOnSubmit() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		elementActions.MoveTo(submit);
		elementActions.clickButton(submit);

	}
	
	
	public void finalStepSubscribe() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(finalStepSubscribeBtn));
		elementActions.MoveTo(finalStepSubscribeBtn);
		elementActions.clickButton(finalStepSubscribeBtn);

	}
	public void clickOnVisaKSAOption() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(visaKSA));
		elementActions.clickButton(visaKSA);
	}
	public void clickOnVisaKWOption() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(visaKW));
		elementActions.clickButton(visaKW);
	}
	
	public void clickOnSTCOption() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clickStc));
		elementActions.clickButton(clickStc);
	}

	public void clickShahedBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(shahid));
		elementActions.clickButton(shahid);
	}
	public void clickShahedVIPBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(shahidVIP));
		elementActions.clickButton(shahidVIP);
	}
	
	
	
	public String getSuccessMessageTitle() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(successMessage);
	}
	public String getpinConfirmationTitle() {
		elementActions = new ElementActions(driver);
		return elementActions.getElementText(pinConfirmation);
	}

	public void clickOnSubscribeBtn() {
		elementActions = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(subsecribe));
		elementActions.clickButton(subsecribe);
	}
	

}
