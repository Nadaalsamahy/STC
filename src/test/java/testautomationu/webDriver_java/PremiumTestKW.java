package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class PremiumTestKW extends BaseTest {
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	private String KSA = "Starting: 15.00 SAR"; 
	private String BH = "";
	private String KW ="Starting: 4.80 KWD";
	ElementActions ElementActions ;
	private String mobileNumber = "0502251678";
	private String successMessage="Your subscription plan is now active.";
	private String esport = "1.55 KWD/month";
	private String fight="1.67 KWD/month";
	@Test()
	public void testLiteSubscribtionKWWithSTCPaymentMethod() {
		generalButtons.clickCountryBtn();
		generalButtons.clickkwaitBtn();
		subscribtionPage.clickOnStartYourPremiumBtn();
		assertEquals(priceAndCurrencyValidation.getKWTitleSTCAndCurrency(), (KW));

		generalButtons.clickOnChoosePaymentMethodBtn();

		generalButtons.clickOnesportBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esport));

		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getShahedKSAPriceAndCurrency().contains(fight));

		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeMobileNumber(mobNumber);
		generalButtons.finalStepSubscribe();
		
		//assertEquals(generalButtons.getTitleSTC(), KW);

	}
}
