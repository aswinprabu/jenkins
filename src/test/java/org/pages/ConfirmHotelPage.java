package org.pages;

import org.bcc.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotelPage extends LibGlobal {
 public ConfirmHotelPage() {
	 PageFactory.initElements(driver, this);
 }
 
 public WebElement getRadioButton() {
	return radioButton;
}

public WebElement getClkNextPageSubmit() {
	return clkNextPageSubmit;
}

@FindBy (id="radiobutton_0")
 private WebElement radioButton;
 
 @FindBy (id="continue")
 private WebElement clkNextPageSubmit;
}
