package icon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// to open linkedin
		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		WebElement linkedin = driver.findElement(By.xpath("/html/body/footer/div[2]/div[3]/a[3]"));
		linkedin.click();

		
		
		// sign to linkedin
		//WebElement signin=driver. findElement(By.className("auth_wall_desktop_profile-login-toggle"));
		//signin.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("email-or-phone")).sendKeys("9629727836");
		//driver.findElement(By.name("password")).sendKeys("Shanjay12345678");
	}
}
