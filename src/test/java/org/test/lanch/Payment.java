package org.test.lanch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends BaseClass {
	public Payment() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(name="radiobutton_0")
	private WebElement Radiobutton;
	
	@FindBy(name="continue")
	private WebElement Continue;
	
	@FindBy(name="first_name")
	private WebElement Firstname;
	
	@FindBy(name="last_name")
	private WebElement Lastname;
	
	@FindBy(name="address")
	private WebElement Billingaddress;
	
	@FindBy(name="cc_num")
	private WebElement Creditcardno;
	
	@FindBy(name="cc_type")
	private WebElement Creditcardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(name="cc_cvv")
	private WebElement ccvno;
	
	@FindBy(name="book_now")
	private WebElement Booknow;
	
	@FindBy(name="order_no")
	private WebElement Oderno;
	
	@FindBy(name="logout")
	private WebElement Logout;

	public WebElement getRadiobutton() {
		return Radiobutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBillingaddress() {
		return Billingaddress;
	}

	public WebElement getCreditcardno() {
		return Creditcardno;
	}

	public WebElement getCreditcardtype() {
		return Creditcardtype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	public WebElement getOderno() {
		return Oderno;
	}

	public WebElement getLogout() {
		return Logout;
	}

}
