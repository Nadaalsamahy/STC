package testautomationu.webDriver_java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class Base {
	protected WebDriver driver;
	public Base(WebDriver driver) {

		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}		
	}

	public Actions Action;
	
	

	protected void clickButton(WebElement button)
	{
		button.click();
	}
	
	protected void setElementText (WebElement textbox , String text)
	{
		textbox.click();
		textbox.sendKeys(text);
	}
	
	protected void setTextElementText (WebElement textbox , String text)
	{
		textbox.click();
		textbox.clear();
		textbox.sendKeys(text);
	}
	protected void setTextElementText2 (WebElement textbox , String text)
	{
		//textbox.clear();
		textbox.sendKeys(text);
	}
	}