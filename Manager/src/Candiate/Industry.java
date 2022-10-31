package Candiate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Industry {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// maximize the window
		driver.manage().window().maximize();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method
		Thread.sleep(2000);

		// Enter unsername and password
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// Click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		// Click Candidate button
		WebElement can = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a"));
		can.click();

		// Click Industry Button
		WebElement Industry = driver.findElement(By.xpath("//*[@id=\"candidate\"]/ul/li[3]/a"));
		wait.until(ExpectedConditions.visibilityOf(Industry));
		Industry.click();

		// Add industry button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/div/a")).click();

		// Industry name ,location ,URL
		driver.findElement(By.name("industry")).sendKeys("LotusTech");
		driver.findElement(By.name("location")).sendKeys("Banglore");
		driver.findElement(By.name("location_url")).sendKeys("https://goo.gl/maps/APS8WhDtH5d5Tpw77");

		// Entering text in offer letter
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
		driver.switchTo().frame(frame1);
		wait.until(ExpectedConditions.visibilityOf(frame1));

		WebElement para = driver.findElement(By.xpath("/html/body/p"));
		para.sendKeys("Helleo");

		// Click save
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();

		// search
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("LotusTech");

		// Click Search button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]")).click();

		// Click name
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_industry\"]/div[2]/a[2]")).click();

		// More info
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[5]/a")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_industry\"]/div[2]/a[2]")).click();

		// click goback
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[6]/button")).click();

		// click delete
		driver.findElement(By.xpath("//*[@id=\"add_industry\"]/div[2]/a[2]")).click();

		// click confirm delete
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[6]/a")).click();
	}
}