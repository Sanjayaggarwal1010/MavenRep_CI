package MavenprojectCI.MavenprojectCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	public static String driverPath = "C:\\Users\\megha\\Desktop\\SeleniumJarFiles\\chromedriver_win32\\";
	 public static WebDriver driver;
	 
	 public void testSelenium() throws Exception {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			String Url = "https://www.americanfunds.com/advisor";
			driver.navigate().to(Url);
			System.out.println(driver.getPageSource());
			System.out.println("Perform global search");
			driver.findElement(By.id("q")).sendKeys("fund");
			driver.findElement(By.xpath("/html/body/div[10]/div/div/div/header/div[1]/div[2]/div[1]/div/ul/li[3]/div/div/div/form/input[2]")).click();
			System.out.println("Results are displayed");
			System.out.println("Login Method started");
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/ul[2]/li[5]/a/span[1]")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/ul[2]/li[5]/ul/li[1]/div[2]/a")).click();
			driver.findElement(By.id("userid")).sendKeys("8726");
            driver.findElement(By.id("password")).sendKeys("gkbb");
            driver.findElement(By.xpath("//*[@id='loginForm2']/div/div/div/div/div[1]/div/button")).click();
            System.out.println("Login Method Ended");
			driver.quit();
			System.out.println("chrome browser Closed");
		}
}
