import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trail12 
{
	public static void main(String args[])
	{
		WebDriver driver;
	System.setProperty("driver.chrome.driver", "C:\\chromedriver.exe");
	//C:\Users\BLTuser.BLT059\eclipse-workspace\Project_Framework\src\test\resources\Testdata;;;src/test/resources/Driver/chromedriver.exe
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.jainbookagency.com//booksearch.aspx?catid=160");
	//WebElement we=driver.findElement(By.xpath("//*[@id=\"navigation\"]//ul//li[2]//a"));
	WebElement w=driver.findElement(By.id("//*[@id=\"navigation\"]//ul//li[2]//a"));
	Actions act=new Actions(driver);
	act.moveToElement(w).build().perform();
	Select se=new Select(driver.findElement(By.xpath("//*[@id=\"navigation\"]//ul//li[2]//a")));
	se.selectByVisibleText("Economics");
	}

}
