package Main_java;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;

public class FileDownload {
	WebDriver driver;
	By Demo=By.xpath("//a[text()='Demo Site']");
	By More=By.xpath("//a[text()='More']");
	By filedn=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[3]/a");
	By download=By.xpath("/html/body/section/div[1]/div/div/div[1]/a");
	
	
	public FileDownload(WebDriver driver) {
		this.driver=driver;
	}

	public void url(String browser) { // Method to launch the browsers chrome, firefox, ie
		try {
			if (browser == "chrome") {
				System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser == "firefox") {
				System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser == "ie") {
				System.setProperty("webdriver.internetexplorer.driver", "Drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (WebDriverException e) {
			System.out.println("Please give valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void loginpage() {//method to launch url
		driver.get("http://practice.automationtesting.in/");

	}
	public void filedn(){//method to run the scenario
		driver.findElement(Demo).click();
	Actions act=new Actions(driver);
	WebElement we=driver.findElement(More);
	WebElement we1=driver.findElement(filedn);
	act.moveToElement(we);
	act.moveToElement(we1).click().build().perform();
	driver.findElement(download).click();
	File f=new File("C:\\Users\\BLTuser.BLT0222\\Downloads\\samplefile.pdf");
	boolean b=f.exists();
	if(b)
	//	Assert.assertTrue(b);
		System.out.println("file exists");
		
	}
	public void quit() {//method to close the browser
		driver.close();
	}
}
