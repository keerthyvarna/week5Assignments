package w5d2leaftapsAssignments;

//import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditLeadStatic extends BaseClass{
	@Parameters({"cname","fname","lname","loc","dep","des","email","province"})
	@Test

	public  void runEditLead(String cname,String fname,String lname,String loc,String dep,String des,String email,String province) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(loc);
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dep);
        driver.findElement(By.id("createLeadForm_description")).sendKeys(des);
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select st = new Select(state);
        st.selectByVisibleText(province);
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("learning java");
       driver.findElement(By.className("smallSubmit")).click();
       System.out.println(driver.getTitle());
       Thread.sleep(3000);
    
	}

}
