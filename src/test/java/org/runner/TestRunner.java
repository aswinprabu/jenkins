package org.runner;

import org.bcc.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src\\test\\resources\\Features", glue="org.step",dryRun=false,
plugin= {"pretty","html:src\\test\\resources\\Report",
		"junit:src\\test\\resources\\Report\\junitreport.xml",
		"json:src\\test\\resources\\Report\\adactin.json"},monochrome = true)
public class TestRunner {
@AfterClass
public static void afterReport() {
	JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\adactin.json");
}
}
