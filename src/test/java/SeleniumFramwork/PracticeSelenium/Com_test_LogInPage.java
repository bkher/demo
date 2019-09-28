package SeleniumFramwork.PracticeSelenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.model.geom.IfElseExpression;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Utility.Com_Utility;


public class Com_test_LogInPage {
	
	
	WebDriver driver;
	Com_LogInPage login;
	Com_Utility utility= new Com_Utility(driver);
	Com_LoginToGmail loginGmail;
	

	@BeforeTest
	
	public void OpenBowser() throws IOException {
		
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagi\\Downloads\\chromedriver_win32_76\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
	//	utility.takescrenshot(driver, "browser with url");
		}catch (Exception e) {
			System.out.println(e);
			utility.takescrenshot(driver, "browsererro");

		}
	}
	
	@Test(enabled=false)
	
	public void LoginValidation() throws IOException {
		login = new Com_LogInPage(driver);
	//	utility = new Com_Utility();
		login.EnterUsername(utility.ReadExcel(1, 2));
		utility.WriteDataInExcel(1, 3);
		login.EnterPassword(utility.ReadExcel(2, 2));
		utility.WriteDataInExcel(2, 3);
		assertEquals(login.ValidateLogin(), true);
		assertEquals(login.FaceBookTextValidation(), utility.ReadExcel(3, 2));
		utility.WriteDataInExcel(3, 3);
		assertEquals(login.FaceBookText1Validation(), utility.ReadExcel(4, 2));
		utility.WriteDataInExcel(4, 3);
		assertEquals(login.CreateAccountValidation(), utility.ReadExcel(5, 2));
		utility.WriteDataInExcel(5, 3);
	}
	
	@Test()
	
	public void LoginWithGmail() throws IOException, InterruptedException{
		loginGmail = new Com_LoginToGmail(driver);
		loginGmail.enterusernames();
		loginGmail.ClickNext();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginGmail.enterpassword();
		loginGmail.ClickNext2();
//		loginGmail.ClickOnUpdateslink();
		for (int i=0;i<230;i++) {
//		loginGmail.ClickOnCheckBox();
//		loginGmail.ClickOnDelete();
		Thread.sleep(8000);
		}
	}
	
	@AfterTest(enabled=false)
	
	public void closedbrowser() {
		
		driver.close();
	}
	
	
}
