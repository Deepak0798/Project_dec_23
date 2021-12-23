package org.test.lanch;

import org.openqa.selenium.WebElement;

public class FinalRun extends BaseClass{
	
	public static void main(String[] args) {
		
		browserLanch("chrome");
		urlLanch("https://adactinhotelapp.com/index.php");
		impWait(45);
		LoginPage l=new LoginPage();
		l.getEmail().sendKeys("deepakjain07");
		l.getPassword().sendKeys("Dj1234");
		l.getSignin().click();

		Hotel h=new Hotel();
		h.getLocation().sendKeys("Paris");
		h.getHotel().sendKeys("Hotel Sunshine");
		h.getRoomtype().sendKeys("Deluxe");
		h.getNoofrooms().sendKeys("2 - Two");
		h.getCheckindate().sendKeys("01/12/2021");
		h.getCheckoutdate().sendKeys("02/12/2021");
		h.getNoofadult().sendKeys("2 - Two");
		h.getSearch().click();
	    
	    Payment p=new Payment();
	    p.getRadiobutton().click();
	    p.getContinue().click();
	    p.getFirstname().sendKeys("Deepak");
	    p.getLastname().sendKeys("Jain");
	    p.getBillingaddress().sendKeys("Dubai Main Road");
	    p.getCreditcardno().sendKeys("1234567890123456");
	    p.getCreditcardtype().sendKeys("VISA");
	    p.getCcexpmonth().sendKeys("November");
	    p.getCcexpyear().sendKeys("2022");
	    p.getCcvno().sendKeys("456");
	    p.getBooknow().click();
	    WebElement oderno = p.getOderno();
	    String string = oderno.getAttribute("value");
	    System.out.println("Oder no is:"+string);

	}

	
	
	
}
