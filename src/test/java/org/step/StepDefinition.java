package org.step;

import org.bcc.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.BookHotel;
import org.pages.ConfirmHotelPage;
import org.pages.LoginPage;
import org.pages.SearchHotelPage;
import org.pages.SelectHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {
	static WebDriver driver;
	LoginPage lp = new LoginPage();
	SearchHotelPage shp = new SearchHotelPage();
	BookHotel bh = new BookHotel();
	ConfirmHotelPage chp = new ConfirmHotelPage();
	SelectHotelPage sp = new SelectHotelPage();

	@Given("User launch AdactIn Hotel Web Application")
	public void user_launch_AdactIn_Hotel_Web_Application() {
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		sendText(lp.getTxtUserName(), "aswinprabu9444");
		sendText(lp.getTxtPassword(), "aswinprabu9444");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_Login_Button() {
		btnClick(lp.getBtnLogin());
	}

	@Then("User verify Search Hotel Page is displayed")
	public void user_verify_Search_Hotel_Page_is_displayed() {
		String searchHotelPageTextVerify = getText(shp.getSearchHotelPage());
		boolean searchHotelPageTextValidation = searchHotelPageTextVerify.contains("Search");
		System.out.println("Search Hotel Page Validation: " + searchHotelPageTextValidation);
	}

	@When("User enters valid location,valid hotels,valid roomtype, valid numberofrooms,valid checkindate,valid checkoutdate, valid adultsperroom,valid childperroom")
	public void user_enters_valid_location_valid_hotels_valid_roomtype_valid_numberofrooms_valid_checkindate_valid_checkoutdate_valid_adultsperroom_valid_childperroom() {
		selectOptionByVisibleText(shp.getDdLocation(), "Paris");
		selectOptionByVisibleText(shp.getDdHotel(), "Hotel Creek");
		selectOptionByVisibleText(shp.getDdRoom(), "Double");
		selectOptionByVisibleText(shp.getDdNoOfRoom(), "2 - Two");
		clearData(shp.getDdCheckIn());
		sendText(shp.getDdCheckIn(), "21/12/2021");
		clearData(shp.getDdCheckOut());
		sendText(shp.getDdCheckOut(), "22/12/2021");
		selectOptionByVisibleText(shp.getDdAdultNumber(), "2 - Two");
		selectOptionByVisibleText(shp.getDdChildNumber(), "4 - Four");
	}

	@When("User clicks on Search Button")
	public void user_clicks_on_Search_Button() {
		btnClick(shp.getBtnClkSubmit());
	}

	@Then("User verify Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
		String selectHotelPageTextVerify = getText(sp.getSelectHotel());
		boolean selectHotelPageTextValidation = selectHotelPageTextVerify.contains("Select");
		System.out.println("Select Hotel Page Validation: " + selectHotelPageTextValidation);
	}

	@Then("User clicks on select radio Button")
	public void user_clicks_on_select_radio_Button() {
		btnClick(chp.getRadioButton());
	}

	@Then("User clicks on Continue Button")
	public void user_clicks_on_Continue_Button() {
		btnClick(chp.getClkNextPageSubmit());
	}

	@Then("User verify Book Hotel Page is displayed")
	public void user_verify_Book_Hotel_Page_is_displayed() {
		String bookHotelPageTextVerify = getText(bh.getBookHotel());
		boolean bookHotelPageTextValidation = bookHotelPageTextVerify.contains("Book");
		System.out.println("Book Hotel Page Validation: " + bookHotelPageTextValidation);
	}

	@When("User enters valid firstname, valid lastname, valid creditcardnumber, valid creditcardtype, valid expirymonth,valid expiryyear, valid cvvnumber")
	public void user_enters_valid_firstname_valid_lastname_valid_creditcardnumber_valid_creditcardtype_valid_expirymonth_valid_expiryyear_valid_cvvnumber() {
		sendText(bh.getTxtFrstName(), "Aswin");
		sendText(bh.getTxtLastName(), "Prabu");
		sendText(bh.getTxtAddress(), "Old Trafford, London");
		sendText(bh.getTxtCcNum(), "1234567890123456");
		selectOptionByVisibleText(bh.getDdCcType(), "VISA");
		selectOptionByValue(bh.getDdExpMnth(), "1");
		selectOptionByValue(bh.getDdExpYear(), "2022");
		sendText(bh.getTxtCvv(), "444");

	}

	@When("User clicks on Book now Button")
	public void user_clicks_on_Book_now_Button() {
		btnClick(bh.getBtnClkBookNow());
	}

	@Then("User verify Booking order page is displayed and  OrderId is validated")
	public void user_verify_Booking_order_page_is_displayed_and_OrderId_is_validated() throws InterruptedException {
		

		pause(6000);
		String bookHotelText = getText(bh.getBookingPage());
		boolean bookConfirmHotelTextValidation = bookHotelText.contains("Booking");
		System.out.println("Booking Hotel Confirmation Validation: " + bookConfirmHotelTextValidation);
		scrollDown(bh.getPrntOrderNo());
		System.out.println("Order Number: " + bh.getPrntOrderNo().getAttribute("value"));

	}

	@Then("User verify whether login page is displayed")
	public void user_verify_whether_login_page_is_displayed() {
		String loginPageTextVerify = getText(lp.getLoginPage());
		boolean loginPageTextValidation = loginPageTextVerify.contains("Adactin");
		System.out.println("Login Page Text Validation: " + loginPageTextValidation);
	}

	@When("User enters {string},{string}")
	public void user_enters(String userName, String passWord) {
		sendText(lp.getTxtUserName(), userName);
		sendText(lp.getTxtPassword(), passWord);
	}

	@When("User enters valid {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_valid(String locationHotel, String hotelsName, String typeOfRoom, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childPerRoom) {
		selectOptionByVisibleText(shp.getDdLocation(), locationHotel);
		selectOptionByVisibleText(shp.getDdHotel(), hotelsName);
		selectOptionByVisibleText(shp.getDdRoom(), typeOfRoom);
		selectOptionByVisibleText(shp.getDdNoOfRoom(), numberOfRooms);
		clearData(shp.getDdCheckIn());
		sendText(shp.getDdCheckIn(), checkInDate);
		clearData(shp.getDdCheckOut());
		sendText(shp.getDdCheckOut(), checkOutDate);
		selectOptionByVisibleText(shp.getDdAdultNumber(), adultsPerRoom);
		selectOptionByVisibleText(shp.getDdChildNumber(), childPerRoom);
	}

	@Then("User clicks on Continue button")
	public void user_clicks_on_Continue_button() {
		btnClick(chp.getClkNextPageSubmit());
	}

	@When("User enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters(String frstName, String lastName, String address, String ccNum, String creditCardType,
			String creditCardExpMonth, String creditCardExpYear, String creditCardCvv) {
		sendText(bh.getTxtFrstName(), frstName);
		sendText(bh.getTxtLastName(), lastName);
		sendText(bh.getTxtAddress(), address);
		sendText(bh.getTxtCcNum(), ccNum);
		selectOptionByVisibleText(bh.getDdCcType(), creditCardType);
		selectOptionByValue(bh.getDdExpMnth(), creditCardExpMonth);
		selectOptionByValue(bh.getDdExpYear(), creditCardExpYear);
		sendText(bh.getTxtCvv(), creditCardCvv);
	}

}
