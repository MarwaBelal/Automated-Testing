package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC30_Student_BorrowBooks_Search_ValidData {
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
		
		driver.findElement(By.cssSelector("div.navbar.navbar-fixed-top.navbar-inverse:nth-child(11) div.navbar-inner div.container div.nav-collapse.collapse ul.nav li.divider-vertical:nth-child(3) > a:nth-child(1)")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.cssSelector("div.navbar.navbar-fixed-top.navbar-inverse:nth-child(11) div.navbar-inner div.container div.nav-collapse.collapse ul.nav li.divider-vertical.open:nth-child(3) ul.dropdown-menu:nth-child(2) > li:nth-child(1)")).click();
		driver.findElement(By.xpath("//a[@href='#myModal4']")).click();
		
		driver.findElement(By.cssSelector("div.modal.hide.fade.in:nth-child(15) div.modal-body form.form-horizontal div.control-group:nth-child(1) div.controls > input:nth-child(1)")).sendKeys("10/12/2015");
		driver.findElement(By.cssSelector("div.modal.hide.fade.in:nth-child(15) div.modal-body form.form-horizontal div.control-group:nth-child(2) div.controls > input:nth-child(1)")).sendKeys("15/12/2015");
		driver.findElement(By.xpath("//div[@id='myModal4']//div[@class='modal-body']//form[@class='form-horizontal']//div[@class='control-group']//div[@class='controls']//button[@type='submit']")).click();		
		
	}
}
