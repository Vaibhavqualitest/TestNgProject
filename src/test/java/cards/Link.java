package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link {
	static WebElement element = null;
	
	public static WebElement link1Test(WebDriver driver) {
		element = driver.findElement(By.partialLinkText("This is a link"));
        System.out.println("Title of page is: " + driver.getTitle());							
		return element;
	}
	
	public static WebElement link2Test(WebDriver driver) {
		element = driver.findElement(By.partialLinkText("This is a link to Homepage"));
		return element;
	}
}
