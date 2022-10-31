package leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleads {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");

		driver.findElement(By.linkText("LOGIN")).click(); // using Selenium click button method

		driver.findElement(By.id("username")).sendKeys("dineshbabujalla@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		// click candidate
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a")).click();

		// click leads
		driver.findElement(By.xpath("//*[@id=\"candidate\"]/ul/li/a")).click();

		// Search box
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("shanjay");

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[1]/form/div/input[2]")).click();

		// click Complete Process
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[6]/a")).click();
		//Interview
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[3]/div/a")).click();
		
		//Candidates need for this program
		driver.findElement(By.xpath("//*[@id=\"optionsRadios9\"]")).click();
	}
}
