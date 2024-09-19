package WebdriverAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentQuestion5 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File homepage= ts.getScreenshotAs(OutputType.FILE);
		
		File hp =new File ("./"+"\\Screenshot\\ss.png");
		FileHandler.copy(homepage, hp);

	}

}
