package Candiate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BulkAssignLeads {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method

		// Enter unsername and password
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		// Click Candidate button
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a")).click();

		// Click bulk Assign Leads
		driver.findElement(By.xpath("//*[@id=\"candidate\"]/ul/li[2]/a")).click();

		// click Unassigned leads
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form[2]/div/label/input")).click();

		// Select team
		WebElement st = driver.findElement(By.xpath("//*[@id=\"agent\"]"));
		Select team = new Select(st);
		team.selectByIndex(1);

		// Click checkbox
		driver.findElement(By.xpath("//*[@id=\"select_all\"]")).click();

		// Click Assign Button
		driver.findElement(By.xpath("//*[@id=\"assignLeads\"]")).click();

	}
}