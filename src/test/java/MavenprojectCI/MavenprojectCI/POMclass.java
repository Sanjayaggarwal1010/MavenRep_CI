package MavenprojectCI.MavenprojectCI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POMclass {
	final WebDriver driver;
	
	public POMclass(WebDriver driver) {
		this.driver = driver;
			
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[10]/div/div/div/header/div[1]/div[2]/div[1]/div/ul/li[3]/div/div/div/form/input[2]")
	 
	 public WebElement Loginbtn;
	
	
	@FindBy(how=How.ID,using="q")
	 
	 public WebElement Searchtxt;
	
	@FindBy(how=How.XPATH,using="/html/body/div[6]/div/div/div/div/div/ul[2]/li[5]/a/span[1]")
	 
	 public WebElement LoginReg;
	
	@FindBy(how=How.XPATH,using="/html/body/div[6]/div/div/div/div/div/ul[2]/li[5]/ul/li[1]/div[2]/a")
	 
	 public WebElement LoginLink;
	
	
	
	
}
