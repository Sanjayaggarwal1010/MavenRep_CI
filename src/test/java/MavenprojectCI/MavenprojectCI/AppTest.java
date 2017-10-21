package MavenprojectCI.MavenprojectCI;

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
			String Url = "https://www.americanfunds.com/advisor";
			driver.navigate().to(Url);
			System.out.println(driver.getPageSource());
			driver.quit();
		}
}
