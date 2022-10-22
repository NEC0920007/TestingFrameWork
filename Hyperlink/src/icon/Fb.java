package icon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shanj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://ec2-65-1-5-19.ap-south-1.compute.amazonaws.com:8000/");
		WebElement facebook = driver.findElement(By.xpath("/html/body/footer/div[2]/div[3]/a[2]"));
		facebook.click();

	}
}