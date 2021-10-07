package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDrop {
	static WebElement fromElement = null;
	static WebElement toElement = null;


	public WebElement fromelement(WebDriver driver) {
		fromElement = driver.findElement(By.id("box"));
		return fromElement;
	}
	
	public WebElement toelement(WebDriver driver) {
		toElement = driver.findElement(By.id("drag_box2"));
		return toElement;
	}
	
	
}
