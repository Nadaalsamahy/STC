package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class LiteTestKSA extends BaseTest {
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String KSA = "Starting: 15.00 SAR"; 
	
	private String totalPrice = "15.00 SAR/month";
			
	ElementActions ElementActions ;
	private String esportKSAPrice = "22.00 SAR/month";
	private String shahedKSAPrice = "30.00 SAR/month";
	private String shahedVIPKSAPrice = "40.00 SAR/month";
	private String fightKSAPrice = "23.00 SAR/month";
	
	

	
	@Test( )
	public void testLiteSubscribtionKSAWithSTCPaymentMethod() {
		
		generalButtons.clickCountryBtn();
		generalButtons.clickSaudiBtn();
		subscribtionPage.clickOnStartYourLiteBtn();
		assertEquals(priceAndCurrencyValidation.getTitleSTCAndCurrency(), (KSA));
		assertEquals(priceAndCurrencyValidation.getTotalPriceTitle(),(totalPrice));
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
		
	}

}
