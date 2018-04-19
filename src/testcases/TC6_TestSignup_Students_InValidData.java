package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC6_TestSignup_Students_InValidData {
	
	//mfrod username 7aga unique 3ndi 3shan user login bs ana 3mlt 2 accounts b nfs el username \o/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sigma\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/library-master/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//a[@href='student_form.php']")).click();
		
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("keya07");
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("123456");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("123456");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Male");
		gender.selectByIndex(0);
		
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys("123456");
		
		driver.findElement(By.name("roll")).clear();
		driver.findElement(By.name("roll")).sendKeys("123456");
		
		driver.findElement(By.name("contact")).clear();
		driver.findElement(By.name("contact")).sendKeys("123456");
		
		Select type = new Select(driver.findElement(By.name("type")));
		type.selectByVisibleText("Student");
		type.selectByIndex(0);
		
		Select level = new Select(driver.findElement(By.name("year_level")));
		level.selectByVisibleText("Second Year");
		level.selectByIndex(1);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
	}
}
