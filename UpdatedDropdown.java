import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\1000071456\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// URL in Browser.
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]*")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]*")).isSelected());
		//driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]*")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]*")).isSelected());
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]*")).isSelected());

		// Count the number of checkboxes
		//System.out.println(driver.findElement(By.cssSelector("input[id*='checkbox']")).getSize());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		 * try { Thread.sleep(2000L); } catch (InterruptedException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		 int i=1; 
		 while (i<5)
	     { driver.findElement(By.id("hrefIncAdt")).click(); 
	        i++;
		 }
		 
		 //System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		  	
		  //For Loop/While Loop 
			/*
			 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click(); }
			 * 
			 * 
			 * driver.findElement(By.id("btnclosepaxoption")).click();
			 * System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
			 */
		 
		
		/*
		 * for (int i = 1; i < 5; i++) {
		 * driver.findElement(By.id("divpaxinfo")).click(); }
		 * //driver.findElement(By.id("btnclosepaxoption")).click();
		 * Assert.assertEquals(driver.findElement(By.id("hrefIncAdt")).getText(),
		 * "5 Adult");
		 * System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		 */
		 
		 //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 //driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
	}

}
