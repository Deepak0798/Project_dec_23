package org.test.lanch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Hotel extends BaseClass {
	public Hotel() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(name="location")
	private WebElement Location;
	
	@FindBy(name="hotels")
	private WebElement Hotel;
	
	@FindBy(name="room_type")
	private WebElement Roomtype;
	
	@FindBy(name="room_nos")
	private WebElement Noofrooms;
	
	@FindBy(name="datepick_in")
	private WebElement Checkindate;
	
	@FindBy(name="datepick_out")
	private WebElement Checkoutdate;
	
	@FindBy(name="adult_room")
	private WebElement Noofadult;
	
	@FindBy(name="child_room")
	private WebElement Noofchild;
	
	@FindBy(name="Submit")
	private WebElement Search;
	
	@FindBy(name="Reset")
	private WebElement Reset;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	public WebElement getCheckindate() {
		return Checkindate;
	}

	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}

	public WebElement getNoofadult() {
		return Noofadult;
	}

	public WebElement getNoofchild() {
		return Noofchild;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getReset() {
		return Reset;
	}
	
	
	
}
