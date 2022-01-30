package assignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_TC01_Create_Contact {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf_January_2022_Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Krishnan");
		driver.findElement(By.id("lastNameField")).sendKeys("Kankipati");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Krishnan");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Kankipati");
		driver.findElement(By.className("smallSubmit")).click();
		String firstName=driver.findElement(By.id("viewContact_firstNameLocal_sp")).getText();
		System.out.println(firstName);
		String title=driver.getTitle();
		System.out.println(title);
		String lastName=driver.findElement(By.id("viewContact_lastNameLocal_sp")).getText();
		System.out.println(lastName);
		driver.close();
	}
}