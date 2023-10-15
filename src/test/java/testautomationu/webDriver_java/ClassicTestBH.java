package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class ClassicTestBH extends BaseTest{

	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String BH = "Starting: 3.00 BHD";
	private String esportBHPrice ="2.07 BHD/month";
	ElementActions ElementActions ;
	private String shahedBHPrice="2.00 BHD/month";
	
	

	@Test()
	public void testLiteSubscribtionBHWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickBahrainBtn();
		subscribtionPage.clickOnStartYourClassicBtn();
		assertEquals(priceAndCurrencyValidation.getBHTitleSTCAndCurrency(), (BH));

		generalButtons.clickOnChoosePaymentMethodBtn();
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportBHPrice));
		

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(shahedBHPrice));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		
		//assertEquals(generalButtons.getTitleSTC(),BH );

		
	}
	
}
