package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class LiteTestKW  extends BaseTest{

	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
			
	ElementActions ElementActions ;
	private String esportKWPrice = "1.55 KWD/month" ;
	private String stcKW = "Starting: 1.20 KWD";
	private String totalChanelPriceKW = "3.22 KWD/month";
	
	
	
	@Test()
	public void testLiteSubscribtionKWWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickkwaitBtn();
		subscribtionPage.clickOnStartYourLiteBtn();
		assertEquals(priceAndCurrencyValidation.getKWTitleSTCAndCurrency(), (stcKW));

		generalButtons.clickOnChoosePaymentMethodBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportKWPrice));

		generalButtons.clickOnesportBtn();
		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getTotalChanelPrice2().contains(totalChanelPriceKW));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		

	}
}
