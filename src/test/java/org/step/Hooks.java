package org.step;

import java.io.IOException;

import org.bcc.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void beforeExecution() {
		launchBrowser("chrome");
		loadUrl("https://adactinhotelapp.com/");
	}
	@After
	public void afterExecution(Scenario s) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "img/png");
		
		quitBrowser();
	}
	}
