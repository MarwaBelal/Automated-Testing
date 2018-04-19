package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC16_TestSignup_Teachers_InValidData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sigma\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/library-master/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//a[@href='teacher_form.php']")).click();
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Marwa");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Belal");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("marwabelal");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Female");
		gender.selectByIndex(1);
		
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Cairo");
	
		driver.findElement(By.name("contact")).clear();
		driver.findElement(By.name("contact")).sendKeys("123456");
		
		Select type = new Select(driver.findElement(By.name("type")));
		type.selectByVisibleText("Teacher");
		type.selectByIndex(0);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
	}
}
