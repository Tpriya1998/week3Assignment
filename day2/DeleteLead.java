package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//enter the username and password 
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRSfma
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Leads
		
		driver.findElement(By.linkText("Leads")).click();
		//Click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//span[@Class='x-tab-strip-text '])[2]")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("954");
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
				
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.close();			
			    	
	}

}
