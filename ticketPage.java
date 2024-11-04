import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ticketPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(5000);
	    driver.findElement(By.linkText("Forgot your password?")).click();

		//driver.findElement(By.cssSelector(".forgot-pwd-container")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sandeep");

	}
}
