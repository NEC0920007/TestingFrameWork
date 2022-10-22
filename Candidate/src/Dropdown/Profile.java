package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// maximize the window
		driver.manage().window().maximize();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/dashboard");

		// Entering credentials
		driver.findElement(By.id("username")).sendKeys("NEC0820024@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		// click dropdown
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span")).click();

		// Click Profile
		driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li/div/a[1]")).click();

		// Click Edit
		driver.findElement(By.xpath("//*[@id=\"edit_btn\"]")).click();

		// Clearing & Entering FirstName. LastName, Address, HighQualification
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("Mohammed");

		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("Razak");

		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Eg: Plot No. 1, Sector 1, Gurgaon");

		// Selecting Highqualification
		
		
		
		
		//Click Update Button
		driver.findElement(By.linkText("//*[@id=\"submit_btn\"]")).click();

	}
}