package w5d2servicenowAssignments;

//import java.util.ArrayList;

import java.util.List;
//import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewCaller extends BaseClass{
	@Test

	public  void newCaller() throws InterruptedException {
		Thread.sleep(6000);
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("caller");
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Caller']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		shadow.findElementByXPath("//button[text()='New']").click();
		shadow.findElementByXPath("//input[@id='sys_user.first_name']").sendKeys("keerthana");
		shadow.findElementByXPath("//input[@id='sys_user.last_name']").sendKeys("Muthukumar");
		String text = shadow.findElementByXPath("//input[@id='sys_user.last_name']").getAttribute("value");
		System.out.println(text);
		shadow.findElementByXPath("//input[@id='sys_user.mobile_phone']").sendKeys("12345");
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
			System.out.println("New caller is created successfully");
		}else {
			System.out.println("New caller is not created");
			
		}
	}
}

		
		
		


	


