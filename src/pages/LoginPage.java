package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.PublicApi;

public class LoginPage {

	public static WebDriver driver;
	
public	LoginPage(WebDriver driver) {
	 this.driver=driver;
	PageFactory.initElements(driver, this);
	 
	
	
	}
//FB login Locators
@FindBy(xpath = "//input[@id='email']")
public  WebElement Username;
@FindBy(xpath = "//input[@id='pass']")
public WebElement Password;
@FindBy (xpath = "//button[@id='loginbutton']")
public WebElement login;

// My contact pages




}
