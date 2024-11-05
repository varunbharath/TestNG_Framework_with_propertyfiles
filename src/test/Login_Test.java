package test;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BrowerSetup;

import org.testng.annotations.BeforeMethod;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login_Test {
	public static WebDriver driver;
	public static Properties prop;
	BrowerSetup setup=new BrowerSetup();
//  @Test
//  public void FB() {
//	 
//		driver.get("https://www.facebook.com/login.php/");
//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("8220113955");
//		WebElement Password= driver.findElement(By.xpath("//input[@id='pass']"));
//		Password.sendKeys("Coimbatore@2020");
//		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
//		login.click();
//	
//  }
//  @Test
//  public void mycontactform() {
//	 
//		driver.navigate().to("https://www.mycontactform.com/samples.php");
//		
//		//Send to
//		
//	    //  Marketing_Departmen
//		WebElement Marketing_Department=driver.findElement(By.xpath("//input[@value='0']"));
//		Marketing_Department.click();
//		//Sales
//		WebElement sales=driver.findElement(By.xpath("(//input[@value='1'])[1]"));
//		sales.click();
//		//Customer_Service
//		WebElement Customer_Service= driver.findElement(By.xpath("//input[@value='2']"));
//		Customer_Service.click();
//		
//		//subject
//		WebElement Subject= driver.findElement(By.xpath("//input[@name='subject']"));
//		Subject.sendKeys("Automation");
//		// Enter the mail id
//		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("123@gmailcom");
//		//Tool Box
//		WebElement toolbox=driver.findElement(By.xpath("//input[@id='q1']"));
//		toolbox.sendKeys("UI Automation");
//		//Multiline
//		WebElement Text_BoxMultiLine=driver.findElement(By.xpath("//textarea[@name='q2']"));
//		Text_BoxMultiLine.sendKeys("UI Automatio for MY contavt form");
//		//dropdown 
//  }
  
   @ Test
   
  public void login() {
	   
	   String url=prop.getProperty("Loginurl");
	   String FBUsername= prop.getProperty("Username");
	   String FBpassword=prop.getProperty("Password");
	   String FBlogingbuttonclick=prop.getProperty("loginbutton");
	   driver.get(url);
//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//	username.sendKeys(FBUsername);
//	WebElement Password= driver.findElement(By.xpath("//input[@id='pass']"));
//	Password.sendKeys(FBpassword);
////		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
////		login.click();
////	
	   LoginPage obj=new LoginPage(driver);
	   obj.Username.sendKeys(FBUsername);
	   obj.Password.sendKeys(FBpassword);
	   obj.login.click();
	   
  }
 public void mycontact() {
	   String url1=prop.getProperty("https://www.mycontactform.com/samples.php");
  String Contact_Subject=prop.getProperty("Subject");
  String Contact_mail=prop.getProperty("Contact_Mail");
//	   String toolbox=prop.getProperty("Contact_tool");
  }
  @BeforeMethod
  public void beforeMethod() {
	this.driver=  setup.driver;
	this.prop=  setup.prop;
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

}
