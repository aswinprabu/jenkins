package org.pages;

import org.bcc.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="first_name")
	private WebElement txtFrstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
	private WebElement ddCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ddExpMnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ddExpYear;
	
	@FindBy(xpath="//td[contains(text(),'Book')]")
	private WebElement bookHotel;
	
	public WebElement getBookHotel() {
		return bookHotel;
	}

	public WebElement getDdExpYear() {
		return ddExpYear;
	}
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	public WebElement getTxtFrstName() {
		return txtFrstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getDdCcType() {
		return ddCcType;
	}

	public WebElement getDdExpMnth() {
		return ddExpMnth;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnClkBookNow() {
		return btnClkBookNow;
	}
	@FindBy (id="book_now")
	private WebElement btnClkBookNow;
	
	@FindBy (id="order_no")
	private WebElement prntOrderNo;
	
	@FindBy (xpath="//td[contains(text(),'Booking')]")
	private WebElement bookingPage;

	public WebElement getBookingPage() {
		return bookingPage;
	}

	public WebElement getPrntOrderNo() {
		return prntOrderNo;
	}
}
