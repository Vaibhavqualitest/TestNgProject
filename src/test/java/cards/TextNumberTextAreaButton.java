package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TextNumberTextAreaButton {
	
	static WebElement element = null;
	
	//1. Text elements	
	public static WebElement textTest(WebDriver driver) {
		element = driver.findElement(By.id("text"));
		return element;
	}
	
	public static WebElement textResultTest(WebDriver driver) {
		element = driver.findElement(By.id("result_button_text"));
		return element;
	}
	
	public static WebElement textResultText(WebDriver driver) {
		element = driver.findElement(By.id("result_text"));
		return element;
	}
	
	//2. Number elements
	public static WebElement numberTest(WebDriver driver) {
		element = driver.findElement(By.id("number"));
		return element;
	}
	
	public static WebElement numberResultTest(WebDriver driver) {
		element = driver.findElement(By.id("result_button_number"));
		return element;
	}
	
	public static WebElement numberResultText(WebDriver driver) {
		element = driver.findElement(By.id("result_number"));
		return element;
	}
	
	//3. Textarea elements
	public static WebElement textAreaTest(WebDriver driver) {
		element = driver.findElement(By.id("text_area"));
		return element;
	}
	
	public static WebElement textAreabuttonTest(WebDriver driver) {
		element = driver.findElement(By.id("result_button_text_area"));
		return element;
	}
	
	public static WebElement textAreaResultText(WebDriver driver) {
		element = driver.findElement(By.id("result_text_area"));
		return element;
	}
	
	//4. Button elements
	public static WebElement button1Test(WebDriver driver) {
		element = driver.findElement(By.id("show_text"));
		return element;
	}
	
	public static WebElement button2Test(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/input"));
		return element;
	}
	
	public static WebElement button1ResultTest(WebDriver driver) {
		element = driver.findElement(By.id("show_me"));
		return element;
	}
	
	//5. Link elements
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
