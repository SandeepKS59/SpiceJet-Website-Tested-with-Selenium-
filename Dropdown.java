import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\1000071456\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
		//driver.findElement(By.xpath("div[@id='glsct100_mainContent_dd1_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	}



 
}
