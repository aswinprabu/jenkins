package org.bcc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
public static void generateJVMReport(String jsonFile) {
	
	//mention location of report
	File reportLocation = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\Report");
	
	//set configurations & classification
	Configuration con = new Configuration(reportLocation, "AdactIn");
	con.addClassifications("Author: ", "Aswin");
	con.addClassifications("PlatForm Name: ", "Windows");
	con.addClassifications("PlatForm Version: ", "10");
	con.addClassifications("Sprint :", "4");
	con.addClassifications("Build Number: ", "5129444");
	
	
	List<String> li = new ArrayList<String>();
	li.add(jsonFile);
	
	//create object for Report Builder Class
	ReportBuilder builder = new ReportBuilder(li,con);
	builder.generateReports();
}
}
