package org.pages;

import org.bcc.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends LibGlobal {
	
public SelectHotelPage() {
PageFactory.initElements(driver, this);
}
@FindBy (xpath="//td[contains(text(),'Select')]")
private WebElement selectHotel;

public WebElement getSelectHotel() {
	return selectHotel;
}

}
