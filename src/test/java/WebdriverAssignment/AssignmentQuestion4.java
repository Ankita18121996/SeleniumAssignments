package WebdriverAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentQuestion4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account'] ")).click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		System.out.println("Is firstname box is enabled? "+firstname.isEnabled());
		firstname.sendKeys("Ankita");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		System.out.println("Is lastname box is enabled? "+lastname.isEnabled());
		lastname.sendKeys("Pateriya");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		System.out.println("Is email box is enabled? "+email.isEnabled());
		email.sendKeys("ankita18121996@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		System.out.println("Is password box is enabled? "+password.isEnabled());
		password.sendKeys("anki1812");
		
		Select daySelect= new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText("18");
		 
		Select monthSelect= new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("Dec");
		
		Select yearSelect= new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("1996");
		
		driver.findElement(By.className("_8esa")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		

	}

}
