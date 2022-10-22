package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximixe Window
		driver.manage().window().maximize();

		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/dashboard");

		// Entering credentials
		driver.findElement(By.id("username")).sendKeys("NEC0820024@nttf.co.in");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		// click login button
		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		// Click StartExam
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/a")).click();

		// Login for exam
		driver.findElement(By.xpath("//*[@id=\"mui-1\"]")).sendKeys("NEC0820024@nttf.co.in");

		driver.findElement(By.xpath("//*[@id=\"mui-2\"]")).sendKeys("P@ssw0rd@123");

		// Click login
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/button")).click();

		// Goback
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button[1]")).click();
		Thread.sleep(1000);

		// Login for exam

		driver.findElement(By.xpath("//*[@id=\"mui-3\"]")).sendKeys("NEC0820024@nttf.co.in");

		driver.findElement(By.xpath("//*[@id=\"mui-4\"]")).sendKeys("P@ssw0rd@123");

		// Click login
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/button")).click();

		// Start Exam
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/button[2]")).click();

		// click Any option & save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// Clear response button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/button")).click();

		// clicking the option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// mark for review
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/label/span[1]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click previous button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[1]")).click();

		// Unclick mark for review
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/label/span[1]")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();
		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click next button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[3]")).click();

		// click option
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/label/span[1]/input")).click();

		// click save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/button[2]")).click();

		// click submit exam
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/button")).click();

		// click no
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]")).click();

		// sunmit button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/button")).click();

		// Click Im sure
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]")).click();

	}
}