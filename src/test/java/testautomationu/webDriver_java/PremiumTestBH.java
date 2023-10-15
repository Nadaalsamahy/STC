package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class PremiumTestBH extends BaseTest{
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();

	private String BH = "Starting: 6.00 BHD";
	ElementActions ElementActions ;
	private String esport = "2.07 BHD/month";
	private String fight="2.00 BHD/month";
	
	
	
	@Test()
	public void testLiteSubscribtionBHWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickBahrainBtn();
		subscribtionPage.clickOnStartYourPremiumBtn();
		assertEquals(priceAndCurrencyValidation.getBHTitleSTCAndCurrency(), (BH));

		generalButtons.clickOnChoosePaymentMethodBtn();
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esport));

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(fight));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		
		//assertEquals(generalButtons.getTitleSTC(),BH );

		
	}
	
	
	
}
