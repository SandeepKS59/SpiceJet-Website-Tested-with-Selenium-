import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	public static void main(String[] args) {
		//Invoking browser
		WebDriverManager.chromedriver().setup();
		
		/* Creating Object */
		WebDriver driver = new ChromeDriver();
		
		/* Implicit wait timeout */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		/* Locators */
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		
				
	}


}
