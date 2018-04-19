package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC22_Contact_InvalidData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sigma\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/library-master/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//html//li[7]/a[1]")).click();
		
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("first_name")).sendKeys("keya07");
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("123456");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("123456");
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
	}
}
