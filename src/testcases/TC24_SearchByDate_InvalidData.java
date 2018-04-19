package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24_SearchByDate_InvalidData {
	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[@href='#myModal2']")).click();
		
		driver.findElement(By.name("from")).sendKeys("01/01/1990eee");
		driver.findElement(By.name("to")).sendKeys("01/01/2017eee");
		driver.findElement(By.cssSelector("div.modal.hide.fade.in:nth-child(13) div.modal-body form.form-horizontal div.control-group:nth-child(3) div.controls > button.btn.btn-success")).click();
	}
}
