package w5d2leaftapsAssignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import java.time.Duration;

public class CreateLeadDynamic extends BaseClass {
	@Test(dataProvider="fetchData")

	public  void runCreateLead(String cname,String fname,String lname,String loc,String Dep,String des,String email,String province) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(loc);
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(Dep);
        driver.findElement(By.id("createLeadForm_description")).sendKeys(des);
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select st = new Select(state);
        st.selectByVisibleText(province);
        Thread.sleep(3000);
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
      
	}


     @DataProvider(name="fetchData")
       public String[][] sendData(){ 
	   String[][] data = new String[2][8]; 
	   data[0][0]="testleaf";
	   data[0][1]="keerthana";
       data[0][2]="Muthukumar";
       data[0][3]="keerthi";
       data[0][4]="Testing";
       data[0][5]="learn testing";
       data[0][6]="abc@gmail.com";
       data[0][7]="New York";
       

       data[1][0]="qeagle"; 
       data[1][1]="keerthi";
       data[1][2]="varna";
       data[1][3]="rathi";
       data[1][4]="java";
       data[1][5]="learn java";
       data[1][6]="xyz@gmail.com";
       data[1][7]="Alabama";
       
       
       return data;

} }

