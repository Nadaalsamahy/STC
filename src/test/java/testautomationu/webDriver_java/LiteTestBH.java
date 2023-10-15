package testautomationu.webDriver_java;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



import util.ElementActions;

public class LiteTestBH extends BaseTest {
ElementActions ElementActions ;
private Faker dataFaker = new Faker();
private String mobNumber = dataFaker.number().digits(10).toString();
private String esportBHRPrice = "2.07 BHD/month";
private String stcBHR = "Starting: 2.00 BHD";
private String totalChanelPriceBHR = "4.07 BHD/month";


	@Test()
	public void testLiteSubscribtionBHWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickBahrainBtn();
		subscribtionPage.clickOnStartYourLiteBtn();
		assertEquals(priceAndCurrencyValidation.getBHTitleSTCAndCurrency(), (stcBHR));

		generalButtons.clickOnChoosePaymentMethodBtn();
		
		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportBHRPrice));

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getTotalChanelPrice2().contains(totalChanelPriceBHR));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		


		
	}
	


	

	
	
	

}
