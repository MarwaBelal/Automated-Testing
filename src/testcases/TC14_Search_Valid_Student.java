package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_Search_Valid_Student{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sigma\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/library-master/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.navbar.navbar-fixed-top.navbar-inverse:nth-child(6) div.navbar-inner div.container div.nav-collapse.collapse ul.nav li:nth-child(4) > a:nth-child(1)")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("keya07");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456");	
		
		driver.findElement(By.name("submit")).click();

		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//a[@href='student.php']")).click();
		driver.findElement(By.xpath("//div[@id='example_filter']//label//input[@type='text']")).sendKeys("Marwa");
	}
}
