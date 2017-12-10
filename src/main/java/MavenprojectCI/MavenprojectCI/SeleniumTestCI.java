package MavenprojectCI.MavenprojectCI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCI {
	
 public static String driverPath = "C:\\Users\\megha\\Desktop\\SeleniumJarFiles\\chromedriver_win32\\";
 public static WebDriver driver;
 
	public static void main(String []args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		String Url = "https://www.americanfunds.com/advisor";
		driver.navigate().to(Url);
		System.out.println(driver.getPageSource());
		driver.quit();
		/* cd C:\Users\megha\Sanjay\San_Test_CI
                    cd C:\Users\megha\Sanjay\San_Test_CI\src\San_CI_Package
                   javac HttpMethods.java
                   java -cp C:\Users\megha\Sanjay\San_Test_CI\src San_CI_Package.HttpMethods
                    pause
                    cd C:\Users\megha\Desktop\SeleniumJarFiles\ST
                   java -jar seleniumtestCI.jar
                   pause
                    exit*/

	}
}
