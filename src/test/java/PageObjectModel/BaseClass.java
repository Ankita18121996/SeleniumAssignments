package PageObjectModel;

import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeMethod
	@BeforeClass
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	lp=new LoginPage(driver);
	
	}
	

}
