package w5d2servicenowAssignments;

//import java.util.ArrayList;



//import java.util.Iterator;
import java.util.List;
//import java.util.Set;

//import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewProposal extends BaseClass{
	@Test

	public  void newProposal() throws InterruptedException {
		Thread.sleep(6000);
		Shadow shadow = new Shadow(driver);
		
		Thread.sleep(80000);
		//Shadow shadow = new Shadow(driver);
		//Thread.sleep(60000);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("proposal");
		shadow.findElementByXPath("//mark[text()='Proposal']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		shadow.findElementByXPath("//button[text()='New']").click();
		//WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(frame1);
		String text = shadow.findElementByXPath("//input[@id='std_change_proposal.number']").getAttribute("value");
		System.out.println("New Proposal Number: "+text);
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys("creating new proposal");
		shadow.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		
		
		List<WebElement> list = shadow.findElementsByXPath("//a[@class='linked formlink']");
		boolean found=false;
		for (WebElement webElement : list) {
			if(webElement.getText().contains(text)) {
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("New proposal is created successfully");
		}else {
			System.out.println("New proposal is not created");
			
		}
	}
}
		
		
		
		
		
		

	


