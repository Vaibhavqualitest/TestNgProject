package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	static WebElement element = null;
	public WebElement checkbox1(WebDriver driver) {
		element = driver.findElement(By.id("vfb-6-0"));
		return element;
	}
	
	public WebElement checkbox2(WebDriver driver) {
		element = driver.findElement(By.id("vfb-6-1"));
		return element;
	}
	
	public WebElement checkbox3(WebDriver driver) {
		element = driver.findElement(By.id("vfb-6-2"));
		return element;
	}
}
