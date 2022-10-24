package shopping.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Instantiation {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") +"/drivers/chromedriver.exe");
//		For headless mode
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");	
		
//      TODO Change to explicit wait
		Thread.sleep(2000);
//		TODO Change to search method
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys("Faded Short Sleeve T Shirt");
		driver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
		driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']")).click();
//      TODO Change to explicit wait		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
//		TODO Change to product selection method
		driver.findElement(By.cssSelector("select[id='group_1']")).click();
		driver.findElement(By.cssSelector("option[title='M']")).click();
		driver.findElement(By.cssSelector("a[id='color_14']")).click();
		driver.findElement(By.cssSelector("button[name='Submit']")).click();
//      TODO Change to explicit wait
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("span[class='cross']")).click();

		driver.findElement(By.cssSelector("input[id='search_query_top']")).clear();
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys("Evening Dress");
		driver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
		driver.findElement(By.cssSelector("img[title='Printed Dress']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("button[name='Submit']")).click();
//      TODO Change to explicit wait
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("span[class='cross']")).click();
		driver.findElement(By.cssSelector("input[id='search_query_top']")).clear();
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys("Printed Summer Dress");
		driver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
		driver.findElement(By.cssSelector("img[title='Printed Summer Dress']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("select[id='group_1']")).click();
		driver.findElement(By.cssSelector("option[title='M']")).click();
		driver.findElement(By.cssSelector("a[id='color_13']")).click();
		driver.findElement(By.cssSelector("button[name='Submit']")).click();
//      TODO Change to explicit wait
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[class='cross']")).click();
		
		driver.findElement(By.cssSelector("a[title='View my shopping cart']")).click();
//      TODO Change to explicit wait
		Thread.sleep(5000);
		List<WebElement> removeButtons = driver.findElements(By.cssSelector("i[class='icon-trash']"));
		removeButtons.get(1).click();
		
		List<WebElement> addButtons = driver.findElements(By.cssSelector("i[class='icon-plus']"));
		addButtons.get(0).click();
		
//		TODO Add assertions
	}

}
