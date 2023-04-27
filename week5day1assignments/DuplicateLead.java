package week5day1assignments;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {
	@Test

	public  void runDuplicateLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keerthana");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthukumar");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("keerthy");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("learning automation using selenium");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthyvarna006@gmail.com");
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select st = new Select(state);
        st.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Duplicate Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathi Varna");
        driver.findElement(By.name("submitButton")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
       
               

	}

}
