package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class classicTestKW extends BaseTest{
	

	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String fight = "1.67 KWD/month"; 
	private String esportKWPrice = "1.55 KWD/month";
	private String KW ="Starting: 2.50 KWD";
	ElementActions ElementActions ;
	
	@Test()
	public void testLiteSubscribtionKWWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickkwaitBtn();
		subscribtionPage.clickOnStartYourClassicBtn();
		assertEquals(priceAndCurrencyValidation.getKWTitleSTCAndCurrency(), (KW));
		generalButtons.clickOnChoosePaymentMethodBtn();
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportKWPrice));
		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(fight));	
		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		

	}
	
}
