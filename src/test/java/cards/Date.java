package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Date {
	static WebElement element = null;

	public WebElement dateElement(WebDriver driver) {
		element = driver.findElement(By.name("vfb-8"));
		return element;
	}
	
	public WebElement datebutton(WebDriver driver) {
		element = driver.findElement(By.id("result_button_date"));
		return element; 
	}
	
	public WebElement datetext(WebDriver driver) {
		element = driver.findElement(By.id("result_date"));
		return element; 
	}
}
