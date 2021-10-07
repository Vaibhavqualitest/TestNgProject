package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio {
	
	static WebElement element = null;
	
	public WebElement radio1(WebDriver driver) {
		element = driver.findElement(By.id("vfb-7-1"));
		return element;
	}
	
	public WebElement radio2(WebDriver driver) {
		element = driver.findElement(By.id("vfb-7-2"));
		return element;
	}
	
	public WebElement radio3(WebDriver driver) {
		element = driver.findElement(By.id("vfb-7-3"));
		return element;
	}

}
