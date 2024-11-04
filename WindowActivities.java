import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivities {

	public static void main(String[] args) {
		
		
		//Invoking browser
				WebDriverManager.chromedriver().setup();
				
		/* Creating Object */
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("http://google.com");
		        driver.navigate().to("http://rahulshettyacademy.com");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        driver.navigate().back();
		        driver.navigate().forward();

	}

}
