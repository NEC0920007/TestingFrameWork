package E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frgtpwd {
	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/login/");
		driver.findElement(By.id("username")).sendKeys("nec0920007@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("e58e305764");
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();
		Thread.sleep(2000);

		WebElement Frgtpwd = driver.findElement(By.xpath("/html/body/section/form/div[5]/a[2]"));
		Frgtpwd.click();
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("nec0920007@nttf.co.in");

		WebElement Sendmail = driver.findElement(By.xpath("/html/body/section/form/div[6]/a[2]"));
		Sendmail.click();
	}
}