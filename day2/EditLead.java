package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//enter the username and password 
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRSfma
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Leads
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("itvps");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Monnaba");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sinhhaapp");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information techn");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It is a paragrraph, i like it, this will be update soon");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("define@gmail.com");
		//for dropdown
		WebElement leadOptions =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(leadOptions);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ymnz");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
		driver.close();
		
		
		

	}

}
