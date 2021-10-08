package tests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import cards.CheckBox;
import cards.Date;
import cards.DragAndDrop;
import cards.Dropdown;
import cards.Link;
import cards.Radio;
import cards.TextNumberTextAreaButton;

public class TjTests {
	
	public WebDriver driver;
	
	@BeforeMethod
	@BeforeSuite
    public void setUp()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.bajpai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tanuj-vishnoi.github.io/site/examples/actions");
    }

	
	@Test(description = "Text card test.")
	public void tests() {
		TextNumberTextAreaButton txt = new TextNumberTextAreaButton();
		txt.textTest(driver).clear();
		txt.textTest(driver).sendKeys("Vaibhav");
		txt.textResultTest(driver).click();
		String resultText = txt.textResultText(driver).getText();
		AssertJUnit.assertEquals(resultText, "You entered text: \"Vaibhav\"");

	}

	@Test(description = "Number card test.")
	public void numbertests() {
		
		TextNumberTextAreaButton txt= new TextNumberTextAreaButton();
		txt.numberTest(driver).clear();
		txt.numberTest(driver).sendKeys("10");
		txt.numberResultTest(driver).click();
		String resultNum= txt.numberResultText(driver).getText();
		AssertJUnit.assertEquals(resultNum, "You entered number: \"10\"");
		
	}
	
	@Test(description = "Textarea card test.")
	public void textareatests() {
		TextNumberTextAreaButton txt= new TextNumberTextAreaButton();
		txt.textAreaTest(driver).clear();
		txt.textAreaTest(driver).sendKeys("This is Vaibhav here");
		txt.textAreabuttonTest(driver).click();
		String resultNum= txt.textAreaResultText(driver).getText();
		AssertJUnit.assertEquals(resultNum, "You entered text area: \"This is Vaibhav here\"");
	}
	
	@Test(description = "Button card test.")
	public void buttontests() {
		TextNumberTextAreaButton txt= new TextNumberTextAreaButton();
		boolean btn1= txt.button1Test(driver).isEnabled();
		AssertJUnit.assertEquals(btn1, true);
		boolean btn2= txt.button2Test(driver).isEnabled();
		AssertJUnit.assertEquals(btn2, false);
		txt.button1Test(driver).click();
		String resultText= txt.button1ResultTest(driver).getText();
		AssertJUnit.assertEquals(resultText, "I am here!");
		boolean btn2Appear= txt.button2Test(driver).isEnabled();
		AssertJUnit.assertEquals(btn2Appear, true);
	}
	
	@Test(description = "Link card test.")
	public void linktests() {
		try {
			driver.wait(5000);
			Link lt= new Link();
			lt.link1Test(driver).click();
			lt.link2Test(driver).click();
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test(description="Checkbox card test")
	public void checkboxtest() {
		CheckBox cb = new CheckBox();
		WebElement op1=cb.checkbox1(driver);
		op1.click();
		boolean resop1=op1.isSelected();
		AssertJUnit.assertEquals(resop1, true);
		
		WebElement op2=cb.checkbox2(driver);
		op2.click();
		boolean resop2=op2.isSelected();
		AssertJUnit.assertEquals(resop2, true);
		
		WebElement op3=cb.checkbox3(driver);
		op3.click();
		boolean resop3=op3.isSelected();
		AssertJUnit.assertEquals(resop3, true);
	}
	
	@Test(description = "Radio card tests")
	public void radioButtontest() {
		Radio radio = new Radio();
		WebElement op1 = radio.radio1(driver);
		op1.click();
		boolean resop1=op1.isSelected();
		AssertJUnit.assertEquals(resop1, true);
		
		WebElement op2=radio.radio2(driver);
		op2.click();
		boolean resop2=op2.isSelected();
		AssertJUnit.assertEquals(resop2, true);
		
		WebElement op3=radio.radio3(driver);
		op3.click();
		boolean resop3=op3.isSelected();
		AssertJUnit.assertEquals(resop3, true);
	}
	
	@Test(description = "Dropdown card test")
	public void dropdowntest() {
		Dropdown dropdown = new Dropdown();
		Select sc = dropdown.drop1(driver);
		sc.selectByVisibleText("Option 1");
		sc.selectByVisibleText("Option 2");
		sc.selectByVisibleText("Option 3");
	}
	
	@Test(description = "Date card test")
	public void datetest() {
		Date date = new Date();
		WebElement wb=date.dateElement(driver);
		wb.sendKeys("11/09/2020");
		
		WebElement resultbutton=date.datebutton(driver);
		resultbutton.click();
		
		WebElement resulttext=date.datetext(driver);
		AssertJUnit.assertEquals(resulttext, "You entered date: 11/09/2020");
	}
	
	@Test(description = "Drag and Drop Test")
	public void dragNdDropTest() {
		DragAndDrop dragdrop = new DragAndDrop();
		WebElement from = dragdrop.fromelement(driver);
		WebElement to = dragdrop.toelement(driver);
		
		//Creating object of Actions class to build composite actions
		Actions builder = new Actions(driver);

		//Building a drag and drop action
		Action dragAndDrop = builder.clickAndHold(from)
		.moveToElement(to)
		.release(to)
		.build();

		//Performing the drag and drop action
		dragAndDrop.perform();
	}
}

