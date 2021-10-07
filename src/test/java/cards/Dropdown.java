package cards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebElement element = null;

	public Select drop1(WebDriver driver) {
		Select sc = new Select(driver.findElement(By.name("vfb-12")));
		return sc;
	}
}
