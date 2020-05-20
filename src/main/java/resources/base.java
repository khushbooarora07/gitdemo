package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver initialisebrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
				"\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		prop= new Properties();
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\global.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		return driver;
		
	}

}
