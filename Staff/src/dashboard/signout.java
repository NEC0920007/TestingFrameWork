package dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signout {
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

		driver.findElement(By.id("username")).sendKeys("NEC0820024@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		// Click dropdown button
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span")).click();

		// Click Signout button
		driver.findElement(By.xpath("/html/body/div/div/nav/div/ul[2]/li/div/a[3]")).click();

	}
}