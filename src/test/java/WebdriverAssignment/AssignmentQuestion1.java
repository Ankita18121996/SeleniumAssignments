package WebdriverAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentQuestion1 {
	//A Webdriver script to navigate to a website and click on a specific link.

	public static void main(String[] args) {
		
		//creating a session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		System.out.println("Title of page 1: "+driver.getTitle());
		
		
		//navigate from google to instagram
		driver.navigate().to("https://www.instagram.com/");
		System.out.println("Title of page 2: "+driver.getTitle());
		
		//clicking on a specific link
		driver.findElement(By.className("_ab37")).click();
		
		
	}

}
