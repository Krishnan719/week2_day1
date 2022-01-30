package assignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments_TC02_Find_Contacts {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		//System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf_January_2022_Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputLogin")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("ext-gen212")).click();
		//driver.close();
	}
}