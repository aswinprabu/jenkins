package org.pages;

import org.bcc.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LibGlobal{
	public  SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//td[contains(text(),'Search')]")
	private WebElement searchHotelPage;
	
	@FindBy(name="location")
	private WebElement ddLocation;
	
	@FindBy(id="hotels")
	private WebElement ddHotel;
	
	@FindBy(id="room_type")
	private WebElement ddRoom;
	
	@FindBy(id="room_nos")
	private WebElement ddNoOfRoom;
	
	public WebElement getDdCheckIn() {
		return ddCheckIn;
	}

	public WebElement getDdCheckOut() {
		return ddCheckOut;
	}

	public WebElement getSearchHotelPage() {
		return searchHotelPage;
	}
	@FindBy (id="datepick_in")
	private WebElement ddCheckIn;
	
	@FindBy (id="datepick_out")
	private WebElement ddCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement ddAdultNumber;
	
	@FindBy(id="child_room")
	private WebElement ddChildNumber;
	
	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotel() {
		return ddHotel;
	}

	public WebElement getDdRoom() {
		return ddRoom;
	}

	public WebElement getDdNoOfRoom() {
		return ddNoOfRoom;
	}

	public WebElement getDdAdultNumber() {
		return ddAdultNumber;
	}

	public WebElement getDdChildNumber() {
		return ddChildNumber;
	}

	@FindBy(id="Submit")
	private WebElement btnClkSubmit;
	
	public WebElement getBtnClkSubmit() {
		return btnClkSubmit;
	}
	
	
}
