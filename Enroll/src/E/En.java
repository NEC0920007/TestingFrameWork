package E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class En {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		driver.findElement(By.linkText("Enroll Now")).click();

		// WebElement enrollnow = driver.findElement(By.name("Enroll Now"));
		// enrollnow.click();
		driver.findElement(By.id("email")).sendKeys("nec0920007@nttf.co.in");
		driver.findElement(By.name("phone_number")).sendKeys("9629727836");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		register.click();
	}

}
