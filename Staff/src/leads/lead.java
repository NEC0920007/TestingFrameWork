package leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lead {
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

		// Profile verification
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[1]/div/a")).click();

		// Edit
		driver.findElement(By.xpath("//*[@id=\"edit_btn\"]")).click();

		// Editing all the details
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("Shanjay");

		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("H");

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("nec0820024@nttf.co.in");

		driver.findElement(By.name("phone_number")).clear();
		driver.findElement(By.name("phone_number")).sendKeys("7355262674");

		WebElement gender = driver.findElement(By.name("gender"));
		Select gen = new Select(gender);
		gen.selectByIndex(2);

		driver.findElement(By.name("date_of_birth")).sendKeys("25092002");

		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Plot No. 12, Sector 13, Gurgaon");

		driver.findElement(By.name("aadhar_number")).clear();
		driver.findElement(By.name("aadhar_number")).sendKeys("123456789045");

		WebElement qualification = driver.findElement(By.name("qualification"));
		Select quali = new Select(qualification);
		quali.selectByIndex(6);

		WebElement State = driver.findElement(By.name("state"));
		Select st = new Select(State);
		st.selectByIndex(23);

		driver.findElement(By.xpath("//*[@id=\"district\"]")).sendKeys("Dharmapuri");

		driver.findElement(By.name("year_of_pass")).clear();
		driver.findElement(By.name("year_of_pass")).sendKeys("2019");

		driver.findElement(By.name("profile_verification_status")).sendKeys("Profile verified");

		// click save
		driver.findElement(By.id("submit_btn")).click();
		
		
		
		//Eligiblity 
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/a")).click();
		
		//Edit 
		driver.findElement(By.xpath("//*[@id=\"edit_btn\"]")).click();
		
		//Eligiblity status
		driver.findElement(By.name("eligibility_status")).sendKeys("Eligible");
		
		//Save
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		
		
		
		//Interview
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[3]/div/a")).click();
		
		//Candidates need for this program
		driver.findElement(By.xpath("//*[@id=\"optionsRadios9\"]")).click();
		
		//Financial background of the candidate
		driver.findElement(By.xpath("//*[@id=\"optionsRadios5\"]")).click();
		
		//Candidate can read / write English
		driver.findElement(By.xpath("//*[@id=\"optionsRadios9\"]")).click();
		
		//Mathematics / Computing
		driver.findElement(By.xpath("//*[@id=\"optionsRadios8\"]")).click();
		
		//General Knowledge
		driver.findElement(By.xpath("//*[@id=\"optionsRadios8\"]")).click();
		
		//Candiate Education 
		driver.findElement(By.xpath("//*[@id=\"interview_form\"]/div[1]/div[6]/label/select")).sendKeys("Accepted");
		
		//Interview Status
		driver.findElement(By.xpath("//*[@id=\"interview_form\"]/div[1]/div[7]/label/select")).sendKeys("Pass");
		
		//Click Save
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		
		
		
		//Offer Letter
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[4]/div/a")).click();
		
		//Edit
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[4]/div/a")).click();
		
		//Offer letter status
		driver.findElement(By.name("offer_letter_status")).sendKeys("Sent to your E-mail");
		
		//Save
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		
		
		
		//Joining
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[5]/div/a")).click();
		
		//Change status
		driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
		 
	}
}
