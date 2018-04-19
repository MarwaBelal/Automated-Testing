package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_Logout {
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
		System.out.println("login");
		//logout
	     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
	     System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
	     String pagetitle = driver.getTitle();
	     System.out.println(pagetitle);
		
	}
}
