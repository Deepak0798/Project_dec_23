package org.test.lanch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseClass {
	public LoginPage() {
PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
    private WebElement btnclose;

	@FindBy(name="username")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement Login;

	@FindBy(name="login")
	private WebElement signin;
	
	public WebElement getBtnclose() {
		return btnclose;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getSignin() {
		return signin;
	}

	

}
