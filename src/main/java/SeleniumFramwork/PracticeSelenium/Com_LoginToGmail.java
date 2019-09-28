package SeleniumFramwork.PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Com_LoginToGmail {

	WebElement wait;
	WebDriver driver;
	By username = By.xpath("//*[@id=\'identifierId\']");
	By Next = By.xpath("//*[@id=\'identifierNext\']/span/span");
	By PassClick = By.xpath("//*[@id=\"headingText\"]/span");
	By password = By.name("password");
	By Next2 = By.xpath("//*[@id=\"passwordNext\"]/span/span");
	By ClickOnSocial= By.xpath("//div[@class=\"aAy aKe-aLe\"]");
	By ClickOnSocialCheckBox = By.xpath("//div[@class='T-I J-J5-Ji T-Pm T-I-ax7 L3 J-JN-M-I']/div[@class='J-J5-Ji J-JN-M-I-Jm']");
	By ClickOnSocialDelete = By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']");
	
	By ClickonPromotions = By.xpath("//div[@class='aAy aJi-aLe']");
	By ClickOnPromotionCheckBox = By.xpath("//div[@id=':2g']/div[@class='J-J5-Ji J-JN-M-I-Jm']");
	By ClickOnpromotionDelete = By.xpath("");
	
	public Com_LoginToGmail(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusernames(){
		
	     driver.findElement(username).sendKeys("kajalvala004@gmail.com");
	     
	}
	public void ClickNext(){
		
	     driver.findElement(Next).click();
		
	}
	public void enterpassword(){
		
//		 System.out.println(driver.findElement(PassClick).getText());
//		 driver.findElement(PassClick).click();
//		 wait = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(password));
	     driver.findElement(password).sendKeys("Kajal@1234");
		
	}
	
	public void ClickNext2(){
		
	     driver.findElement(Next2).click();
	}
	
	}
