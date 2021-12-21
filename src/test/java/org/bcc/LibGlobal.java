package org.bcc;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions ac;
	public static Alert al;
	public static Navigation navigate;
	public static JavascriptExecutor js;
	
	public WebDriver launchBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void sendText(WebElement we,String data) {
		we.sendKeys(data);
	}
	public void btnClick(WebElement we) {
		we.click();
	}
	public void clearData(WebElement we) {
		we.clear();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public String getCurrentPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getText(WebElement we) {
		String text = we.getText();
		return text;
	}
	public String getAttribute(WebElement we , String value) {
		String attribute = we.getAttribute(value);
		return attribute;
	}
	public void dragAndDrop(WebElement source, WebElement target) {
		ac= new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}
	public void moveToElement(WebElement target) {
		ac=new Actions(driver);
		ac.moveToElement(target).perform();
	}
	public void contextClick(WebElement target) {
		ac= new Actions(driver);
		ac.contextClick(target).perform();
	}
	public void doubleClick(WebElement target) {
		ac= new Actions(driver);
		ac.doubleClick(target).perform();
	}
	public void selectOptionByIndex(WebElement we,int index) {
		Select s = new Select(we);
		s.selectByIndex(index);
	}
	public void selectOptionByValue(WebElement we , String value) {
		Select s = new Select(we);
		s.selectByValue(value);
	}
	public void selectOptionByVisibleText(WebElement we, String text) {
		Select s = new Select(we);
		s.selectByVisibleText(text);
	}
	public void deselectOptionByIndex(WebElement we,int index) {
		Select s = new Select(we);
		s.deselectByIndex(index);
	}
	public void deselectOptionByValue(WebElement we , String value) {
		Select s = new Select(we);
		s.deselectByValue(value);
	}
	public void deselectOptionByVisibleText(WebElement we, String text) {
		Select s = new Select(we);
		s.deselectByVisibleText(text);
	}
	public void deselectAll(WebElement we) {
		Select s = new Select(we);
		s.deselectAll();
	}
	public boolean isMultiple(WebElement we) {
		Select s = new Select(we);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	public List<WebElement> getOptions(WebElement we) {
		Select s = new Select(we);
		List<WebElement> list = s.getOptions();
		return list;
	}
	public String getFirstSelectedOption(WebElement we) {
		Select s = new Select(we);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}
	public List<WebElement> getAllSelectedOptions(WebElement we) {
		Select s = new Select(we);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	public void Switch() {
		driver.switchTo();
	}
	public void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();
	}
	public void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}
	public void promptAlert(String data) {
		al = driver.switchTo().alert();
		al.sendKeys(data);
		al.accept();
	}
	public void pause(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public void navigateTo(String url) {
		navigate=driver.navigate();
		navigate.to(url);
	}
	public void navigateForward() {
		navigate=driver.navigate();
		navigate.forward();
	}
	public void navigateBack() {
		navigate=driver.navigate();
		navigate.back();
	}
	public void navigateRefresh() {
		navigate=driver.navigate();
		navigate.refresh();
	}
	public void switchToFrame(String id) {
		driver.switchTo().frame(id);
	}
	public void switchToFrame(WebElement we) {
		driver.switchTo().frame(we);
	}
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	public void switchTodefaultContent() {
		driver.switchTo().defaultContent();
	}
	public void takeScreenshot(String folLocation) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(folLocation);
		FileUtils.copyFile(file, des);
	}
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public void scrollUp(WebElement up) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", up);
	}
	public void scrollDown(WebElement down) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
	}
	}
