package Exams;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Sections2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/dashboard/");

		// maximize the window
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("manager@gmail.com");
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd@123");

		WebElement loginButtonId = driver.findElement(By.xpath("/html/body/section/form/div[3]/button"));
		loginButtonId.click();

		driver.get(
				"http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/examination/add_question/fdafc867-f185-45d6-a638-ef052411a082/");

		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));

		driver.switchTo().frame(frame1);

		WebElement para = driver.findElement(By.xpath("/html/body/p"));
		para.sendKeys("Helleo");

	}
}