package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class PremiumTestKSA extends BaseTest{
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String fight = "23.00 SAR/month"; 
	private String BH = "Starting: 60.00 SAR";
	private String shahedVIP ="40.00 SAR/month";
	ElementActions ElementActions ;
	private String esportPrice = "22.00 SAR/month";
	private String shahedKSAPrice="30.00 SAR/month";
	
	@Test()
	public void testClassicSubscribtionKSAWithSTCPaymentMethod() {
		
		generalButtons.clickCountryBtn();
		generalButtons.clickSaudiBtn();
		subscribtionPage.clickOnStartYourPremiumBtn();
		assertEquals(priceAndCurrencyValidation.getTitleSTCAndCurrency(), (BH));
		generalButtons.clickOnChoosePaymentMethodBtn();
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportPrice));

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(shahedKSAPrice));

		generalButtons.clickShahedVIPBtn();
		assertTrue(priceAndCurrencyValidation.getShahedVIPriceAndCurrency().contains(shahedVIP));

		generalButtons.clickfightBtn();
		assertTrue(priceAndCurrencyValidation.getFightPriceAndCurrency().contains(fight));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
	
		
	}
}
