package libraries;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Annotations {
	public String excelFileName;
	public static ChromeDriver driver;
	PdfUtility pdfUtility=new PdfUtility();
	public static List<String> resultList=new ArrayList<String>();
	@Parameters({"url"})
	@BeforeMethod
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver86.exe");
		//add test result header information to the resultList
		resultList.add("Step Id,    Action,               Expected Result,            Actual Result ,        Test Result");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		resultList.add("1,          Open Browser,         Browser should open,          Browser Opened,        Pass");
		
		
	}



	@AfterMethod
	public void CloseBrowser() throws IOException {
		//close the driver
		driver.close();
		//define a time stamp string to add to the test result 
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		//add time stamp to the resultList
		resultList.add("Test Ends: " + timeStamp);
		 
		//write the test result pdf file with file name TestResult
		pdfUtility.WriteTestResultToPdfFile("TestResult.pdf", resultList); 

		//quit the driver
		driver.quit();
	}













}
