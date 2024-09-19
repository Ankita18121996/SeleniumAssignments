package WebdriverAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentQuestion3 {

	public static void main(String[] args) throws InterruptedException {
       
		//creating a session
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		WebElement ele = driver.findElement(By.name("searchVal"));
		ele.click();
		ele.sendKeys("Handbags");
		
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='rilrtl-list ']//li[@class='rilrtl-list-item']"));
		
		System.out.println("Total Options are: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			  System.out.println(i.getText());
			  Thread.sleep(1000);
			 
		}
		
		
	}

}
