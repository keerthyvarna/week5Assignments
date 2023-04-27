package w5d2servicenowAssignments;

import java.util.List;



import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewIncident extends BaseClass{
	
	
	@Test
	

	public  void newIncident() throws InterruptedException {
		Thread.sleep(6000);
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incident");
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Incident']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		shadow.findElementByXPath("//button[text()='New']").click();
	    String text = shadow.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
		System.out.println("New Incident Number: "+text);
		shadow.findElementByXPath("//input[@id='incident.short_description']").sendKeys("creating new incident");
		shadow.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(text,Keys.ENTER);
		List<WebElement> list = shadow.findElementsByXPath("//a[@class='linked formlink']");
		boolean found=false;
		for (WebElement webElement : list) {
			if(webElement.getText().contains(text)) {
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("New incident is created successfully");
		}else {
			System.out.println("New incident is not created");
		}
		}
        
        
        


}
