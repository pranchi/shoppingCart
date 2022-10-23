package shopping.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Instantiation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/franc/OneDrive - University of Strathclyde/Interview/global/TechnicalTest/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys("Faded Short Sleeve T Shirt");
		driver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
		driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']")).click();
		Thread.sleep(3000);
//		driver.switchTo().frame("fancybox-frame1666303304916");
		driver.switchTo().frame(0);
//		frame1666307389391
		driver.findElement(By.cssSelector("select[id='group_1']")).click();
		driver.findElement(By.cssSelector("option[title='M']")).click();
		driver.findElement(By.cssSelector("a[id='color_14']")).click();
		driver.findElement(By.cssSelector("button[name='Submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("span[class='cross']")).click();
		driver.findElement(By.cssSelector("input[id='search_query_top']")).clear();
		driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys("Evening Dress");
		driver.findElement(By.cssSelector("button[class='btn btn-default button-search']")).click();
		driver.findElement(By.cssSelector("img[title='Printed Dress']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("button[name='Submit']")).click();
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
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[class='cross']")).click();
		
		driver.findElement(By.cssSelector("a[title='View my shopping cart']")).click();
		Thread.sleep(5000);
		List<WebElement> removeButtons = driver.findElements(By.cssSelector("i[class='icon-trash']"));
		removeButtons.get(1).click();
		
		List<WebElement> addButtons = driver.findElements(By.cssSelector("i[class='icon-plus']"));
		addButtons.get(0).click();
		
		
		
//		driver.findElement(By.xpath("ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")).click();
//		List <WebElement> categories = driver.findElements(By.cssSelector("a[title='T-shirts']"));
//		WebElement categoriesList = driver.findElement(By.cssSelector("ul[class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']"));
//		List <WebElement> categories = categoriesList.findElements(By.tagName("li"));
//		System.out.println(categories.size());
//		System.out.println(categories);
//		driver
//		driver.findElement(By.xpath("a[contains(title,'T-shirts')]")).click();	
	}

}
