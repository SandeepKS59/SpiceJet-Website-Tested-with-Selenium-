import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		// Invoking Browser
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\1000071456\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//Invoking browser
		WebDriverManager.chromedriver().setup();
		
		/* Creating Object */
		WebDriver driver = new ChromeDriver();

		/* Implicit wait timeout */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		/* Locators */
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mr.Sandeep Kumar Singh R");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sandeep@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543217");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mr.Sandeep Kumar Singh R");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	}

}
