package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mandatoryfields {
	WebDriver driver;
	By Demosite=By.xpath("//*[@id=\"menu-item-251\"]/a");
	By Firstname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By Lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Email=By.xpath("//*[@id=\"eid\"]/input");
	By Phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By Gender=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By Country=By.xpath("//*[@id=\"countries\"]");
	By CountryName=By.xpath("//*[@id=\"countries\"]/option[106]");
	By Submit=By.xpath("//*[@id=\"submitbtn\"]");
	
	public Mandatoryfields(WebDriver driver) {
		this.driver=driver;
	}

	public void url(String browser) { // Method to launch the browser may be chrome, firefox, ie
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
	public void loginpage() {// to launch the browser
		driver.get("http://practice.automationtesting.in/");
}
	public void demo() {//to click on demosite
		driver.findElement(Demosite).click();
		
		
	}
	public void Attributes() {// to run the scenario
		driver.findElement(Firstname).sendKeys("chaitanya");
		driver.findElement(Lastname).sendKeys("Sure");
		driver.findElement(Email).sendKeys("SureChaitanya2@gmail.com");
		driver.findElement(Phone).sendKeys("0123456789");
		driver.findElement(Gender).click();
		driver.findElement(Country).click();
		driver.findElement(CountryName).click();
		
	}
		
	public void Submit() throws InterruptedException
	{//to click on submit
		driver.findElement(Submit).click();
		Thread.sleep(3000);
	
	}
	public void screenshot(String path) throws IOException {// to take a screenshot
		TakesScreenshot ts=((TakesScreenshot) driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}
	public void quit() {// to close the browser
		driver.close();
	}
}