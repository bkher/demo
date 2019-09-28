package SeleniumFramwork.PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Com_LogInPage {

	WebDriver driver;
	By usrname = By.name("email");
	By password = By.id("pass");
	By LogInLink = By.id("u_0_3");
	By Facebook_text = By.xpath("//u[text()='Facebook']");
	By Facebook_text1 = By.xpath("//div[contains(text(),'Facebook helps you connect')]");
	By FaceBook_CreateAcc= By.xpath("//span[contains(text(),'Create an account')]");
	
	public Com_LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterUsername(String username) {
		driver.findElement(usrname).sendKeys(username);
	}
	
	public void EnterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
		//password.sendKeys(Password);
	}
	
	public boolean ValidateLogin() {
		return driver.findElement(LogInLink).isEnabled();

	}
	public String FaceBookTextValidation() {
	
		return driver.findElement(Facebook_text).getText();
	}

	public String FaceBookText1Validation() {
		
		return driver.findElement(Facebook_text1).getText();
	}
	
	public String CreateAccountValidation() {
		
		return driver.findElement(FaceBook_CreateAcc).getText();
	}

}
