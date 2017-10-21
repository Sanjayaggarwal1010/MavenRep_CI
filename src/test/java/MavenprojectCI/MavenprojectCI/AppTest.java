package MavenprojectCI.MavenprojectCI;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		    System.out.println("Login Method Ended");
            driver.navigate().to("https://www.thecapitalgroup.com/us/about.html");
             driver.findElement(By.linkText("Our Locations")).click();
             List<WebElement> Locations = driver.findElements(By.xpath("//div[@class='row-fluid office-locations']/div/ul/li"));
             int totalCGLocation = Locations.size();
             List<WebElement> Ofcdetails = driver.findElements(By.xpath("//div[@class='office-details']/div"));
            
            for (int j=0 ; j<totalCGLocation ; j++)
            {
            	Locations.get(j).click();               	 
            		 
               String ofcdetailexists =  Ofcdetails.get(j).getAttribute("class");
               System.out.println(ofcdetailexists);
                 String ofcid = Ofcdetails.get(j).getAttribute("id");
                System.out.println(ofcid); 
               // System.out.println(String.format("//div[@id = '{0}']//img", ofcid)); 
                
                System.out.println(String.format("//div[@id = '"+ofcid+"']//img")); 
                                
                String Ofcimagepath = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//img"))).getAttribute("alt");
               System.out.println(Ofcimagepath);
              String Ofcname = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//h1"))).getText();
              System.out.println(Ofcname);
              String Ofcaddress = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//div[@class='address']"))).getText();
              System.out.println(Ofcaddress);
              String Ofcaddressviewmap = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//div[@class='address']//a"))).getText();
              System.out.println(Ofcaddress);
              String Ofcstatslocalemployer = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//div[@data='office-employer-since']", ofcid))).getText();
              System.out.println(Ofcstatslocalemployer);
              String Ofcstatsassociates = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//div[@data='office-associates']"))).getText();
                System.out.println(Ofcstatsassociates);
                String Ofcstatsdisclaimers = driver.findElement(By.xpath(String.format("//div[@id = '"+ofcid+"']//div[@data='office-disclaimer']"))).getText();
             System.out.println(Ofcstatsdisclaimers);
           
            }
			driver.quit();
			System.out.println("chrome browser Closed");
			System.out.println("End of Method");
		}
}
