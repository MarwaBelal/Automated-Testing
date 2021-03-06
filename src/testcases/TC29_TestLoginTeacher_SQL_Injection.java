package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC29_TestLoginTeacher_SQL_Injection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sigma\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/library-master/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.navbar.navbar-fixed-top.navbar-inverse:nth-child(6) div.navbar-inner div.container div.nav-collapse.collapse ul.nav li:nth-child(4) > a:nth-child(1)")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("ABC");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("anything' OR 'x'='x");
		
		driver.findElement(By.name("submit")).click();
		
		//actual title
		String my_title = driver.getTitle();
		System.out.println("title is "+my_title);
		String expected_title = "Online Library System";
		
		if(my_title.equals(expected_title))
			System.out.println("pass");	
	}
}
