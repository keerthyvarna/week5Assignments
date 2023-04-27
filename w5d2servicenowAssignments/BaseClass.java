package w5d2servicenowAssignments;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//import io.github.sukgu.Shadow;

public class BaseClass {
	//NewIncident ni = new NewIncident();
	
	
	public ChromeDriver driver;
	public String text;
	
	@Parameters({"url","user","password"})
	@BeforeMethod()
	
		public void preCondition(String url,String user,String pwd) throws InterruptedException {
		
		
		
		        driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(user);
				driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
				driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
				
							
		}


 @AfterMethod() 
 public void postCondition() { 
	  
	  driver.quit(); 
	  } 
  }
  
 


