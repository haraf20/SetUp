package bonsai_invoice_automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BonsaiInvoiceSetUp {
	
	private static BonsaiInvoiceSetUp bonsaiInvoiceSetUp;
	private static WebDriver driver;
	
	
	private BonsaiInvoiceSetUp() {
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.hellobonsai.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		
		if(bonsaiInvoiceSetUp == null) {
			bonsaiInvoiceSetUp = new BonsaiInvoiceSetUp();
		}
	}
	public static void tearBonsaiDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
	public static void closeTest() {
		
	}

}
