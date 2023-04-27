package w5d2servicenowAssignments;

import org.openqa.selenium.Keys;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident extends BaseClass {
	@Parameters({"num"})
	@Test	
	

	public  void updateIncident(String num) throws InterruptedException {
			
		Thread.sleep(6000);
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incident");
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Incident']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(num,Keys.ENTER);
		shadow.findElementByXPath("//a[@class='linked formlink']").click();
		WebElement dd = shadow.findElementByXPath("//select[@id='incident.urgency']");
		Select dd1 = new Select(dd);
		dd1.selectByIndex(0);
		WebElement dd2 = shadow.findElementByXPath("//select[@id='incident.state']");
		Select dd3 = new Select(dd2);
		dd3.selectByIndex(1);
		shadow.findElementByXPath("//button[@id='sysverb_update_bottom']").click();
		//shadow.findElementByXPath("//a[@class='linked formlink']").click();
	 //   String text1 = shadow.findElementByXPath("//select[@id='incident.urgency']").getAttribute("value");
	   // System.out.println(text1);
	}
}

/*
 * @DataProvider(name="fetchdata") public Object[]sendData(){
 * 
 * return new Object[] {text}; } }
 */