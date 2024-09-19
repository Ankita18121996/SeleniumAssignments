package WebdriverAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By user =By.name("username");
	By pwd = By.name("password");
	By login = By.className("orangehrm-login-button");
	
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String username,String password)
	{
		driver.findElement(user).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(login).click();
	}
	
	

}
