package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerSetup {
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		try {
		File f= new File("C:\\Users\\kumar\\eclipse-workspace\\FrameWork_creation\\inputs.properties");
		FileInputStream fis= new FileInputStream(f);
		
		prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty(""));
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}
