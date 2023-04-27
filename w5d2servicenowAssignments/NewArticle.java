package w5d2servicenowAssignments;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewArticle extends BaseClass{
	@Test

	public  void newArticle() throws InterruptedException {
		Thread.sleep(6000);
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.findElementByXPath("//span[text()='Create an Article']").click();
		shadow.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']").sendKeys("IT");
		shadow.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_category']").sendKeys("Java");
		shadow.findElementByXPath("//input[@id='kb_knowledge.short_description']").sendKeys("creating new article ");
		shadow.findElementByXPath("//button[@value='sysverb_insert']").click();
	}

}
