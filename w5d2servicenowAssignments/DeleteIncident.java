package w5d2servicenowAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClass {
	@Parameters({"num"})
	@Test(dependsOnMethods="w5d2servicenowAssignments.UpdateIncident.updateIncident")

	public  void deleteIncident(String num) throws InterruptedException {
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
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(num,Keys.ENTER);
		shadow.findElementByXPath("//a[@class='linked formlink']").click();
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//button[@id='sysverb_delete_bottom']").click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(num,Keys.ENTER);
		List<WebElement> list = shadow.findElementsByXPath("//a[@class='linked formlink']");
		boolean found=false;
		for (WebElement webElement : list) {
			if(webElement.getText().contains(num)) {
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("Incident is not deleted");
		}else {
			System.out.println("Incident is deleted successfully");
		}
	}
}
		
        
        
        





	


