package zoopla.uk.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BasePage {
	
	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;
	
	public BasePage() {
	logger = Logger.getLogger("QA Enginerr = Faisal");
	PropertyConfigurator.configure("Log4j.properties");
	
	try {
		prop = new Properties();
		FileInputStream Faisal = new FileInputStream(
		System.getProperty("user.dir") + "/src/main/java/configurate/config.properties");
		prop.load(Faisal);
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}}

	
    public static void initializations() {
    //System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe"); 
    	
   // WebDriverManager.chromedriver().setup();
    //driver = new ChromeDriver();
    String AppLink = prop.getProperty("browser");
    if(AppLink.equals("chrome")) {
    logger.info("User able to open chrome browser");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    }else if (AppLink.equals("edge")) {
    logger.info("user able top edge browser");
    System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
    driver = new EdgeDriver();
    }   
    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//System.out.println(prop.getProperty("URL"));
    }
	
    
}
