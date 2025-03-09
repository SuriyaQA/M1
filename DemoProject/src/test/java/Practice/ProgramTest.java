package Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProgramTest {

	@Test
	public void testCase() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Suriy\\eclipse-workspace\\DemoProject\\ExtentReport\\report.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test = report.createTest("testCase");
		//test.log(Status.PASS, "test Case added");
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"image captured");
		report.flush();
	}
}
