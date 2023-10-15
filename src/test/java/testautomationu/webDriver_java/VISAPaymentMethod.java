package testautomationu.webDriver_java;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import util.ElementActions;

public class VISAPaymentMethod extends BaseTest{
	
	private Faker dataFaker = new Faker();
	private String mobNumber = dataFaker.number().digits(10).toString();
	//private String emailData = dataFaker.funnyName().name();
	private String emailData = "SummerShehab1995@gmail.com";

	private String password = dataFaker.number().digits(8).toString();
	private String cardNameData = dataFaker.name().name().toString();
	private String cardNumberData = dataFaker.number().digits(16).toString();
	private String cardExpireMonth = dataFaker.number().digits(2).toString();
	private String cardExpireYear = dataFaker.number().digits(2).toString();
	private String cardCVV = dataFaker.number().digits(3).toString();




			
	ElementActions ElementActions ;

	private String esportBHRPrice = "2.07 BHD/month";

	private String esportKWPriceVISA = "5.00 USD/month" ;

				private String stcBHR = "Starting: 2.00 BHD";
	private String totalPriceBHR = "Fight Sports 2.00 BHD/month";
	private String totalChanelPriceBHR = "4.07 BHD/month";

	private String totalChanelPriceKWVISA = "10.33 USD/month";

	private String visaKW = "Starting: 4.80 USD";
	@Test
	public void testLiteSubscribtionKWWithVISAPaymentMethod(){
		generalButtons.clickCountryBtn();
		generalButtons.clickkwaitBtn();
		subscribtionPage.clickOnStartYourLiteBtn();
		generalButtons.clickOnVisaKWOption();
		assertEquals(priceAndCurrencyValidation.getTitleVisaKW(), (visaKW));
		generalButtons.clickOnChoosePaymentMethodBtn();
		assertTrue(priceAndCurrencyValidation.getEsportKSAPriceAndCurrency().contains(esportKWPriceVISA));
		generalButtons.clickOnesportBtn();
		generalButtons.clickShahedBtn();
		assertTrue(priceAndCurrencyValidation.getTotalChanelPrice2().contains(totalChanelPriceKWVISA));
		generalButtons.clickOnchooseAddOnBtn();
		generalButtons.typeEmail(emailData);
		generalButtons.typePassword(password);
		generalButtons.finalStepSubscribe();
		generalButtons.typeCardHolderName(cardNameData);
		generalButtons.typeCardNumber(cardNumberData);
		generalButtons.typeExpireMonth(cardExpireMonth);
		generalButtons.typeExpireYear(cardExpireYear);
		generalButtons.typeCVV(cardCVV);
		generalButtons.clickOnSubmit();

	}

}
