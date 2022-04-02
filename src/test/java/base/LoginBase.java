package base;

public class LoginBase {
	public static WebDriver driver;  
	 public static void initDriver() {  
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
	 } 

}
