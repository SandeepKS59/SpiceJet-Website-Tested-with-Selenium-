import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

	public static void main(String[] args) {
		
		//Invoking browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1000071456\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
        /* Creating Object */
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
		
		  WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 

		  Select dropdown = new Select(staticDropdown); 
		  dropdown.selectByIndex(3);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByVisibleText("AED");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByValue("INR");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  
		 
        

	}

}
