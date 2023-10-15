package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class ClassicTestKSA extends BaseTest{
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String KSA = "Starting: 25.00 SAR"; 
	private String shahedKSAPrice = "30.00 SAR/month";
	
	private String esportKSAPrice ="22.00 SAR/month";
	private String fightKSAPrice ="23.00 SAR/month";

	ElementActions ElementActions ;
	private String shahedVIPKSAPrice="40.00 SAR/month";
	
	
	@Test()
	public void testClassicSubscribtionKSAWithSTCPaymentMethod() {
		
		generalButtons.clickCountryBtn();
		generalButtons.clickSaudiBtn();
		subscribtionPage.clickOnStartYourClassicBtn();
		assertEquals(priceAndCurrencyValidation.getTitleSTCAndCurrency(), (KSA));
		generalButtons.clickOnChoosePaymentMethodBtn();
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportKSAPrice));

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(shahedKSAPrice));

		generalButtons.clickShahedVIPBtn();
		assertTrue(priceAndCurrencyValidation.getShahedVIPriceAndCurrency().contains(shahedVIPKSAPrice));

		generalButtons.clickfightBtn();
		assertTrue(priceAndCurrencyValidation.getFightPriceAndCurrency().contains(fightKSAPrice));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		
		///assertTrue(generalButtons.getSuccessMessageTitle().contains(successMessage));
		
	}
}
