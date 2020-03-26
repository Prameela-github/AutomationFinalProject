package Main_java;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Excelutility.Excel_data;

public class Invaliddetails {
	
		WebDriver driver;
	
	
		By MyAccount=By.xpath("//*[@id=\"menu-item-50\"]/a");
		By Email=By.id("username");
		By Password=By.id("password");
		By Login=By.name("login");
		By Demosite=By.xpath("//*[@id=\"menu-item-251\"]/a");
		By Firstname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
		By Lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
		By email123=By.xpath("//*[@id=\"eid\"]/input");
		By Phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
		By Gender=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
		By Country=By.xpath("//*[@id=\"countries\"]");
		By CountryName=By.xpath("//*[@id=\"countries\"]/option[106]");
		By Submit=By.xpath("//*[@id=\"submitbtn\"]");
		public Invaliddetails(WebDriver driver) {
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
		public void loginpage() {// to lainch the url
			driver.get("http://practice.automationtesting.in/");

		}
		public void MyAccount() {//to click my account
			driver.findElement(MyAccount).click();
		}
		public void logindetails() throws IOException {
			Excel_data ed=new Excel_data(driver);
			driver.findElement(Email).sendKeys(ed.Email(1));
			driver.findElement(Password).sendKeys(ed.Password(1));
		}
		public void login() {//to click login
			driver.findElement(Login).click();
		}
		public void demo() {//to click demosite
			driver.findElement(Demosite).click();
			
			
		}
		public void Attributes() {// to run the scenario
			//Excel_data ed=new Excel_data(driver);
			driver.findElement(Firstname).sendKeys("chaitanya");
			driver.findElement(Lastname).sendKeys("Sure");
			driver.findElement(email123).sendKeys("SUreChaitanya");
			driver.findElement(Phone).sendKeys("0123456789");
			driver.findElement(Gender).click();
			driver.findElement(Country).click();
			driver.findElement(CountryName).click();
			
		}
			
		public void Submit()
		{//to click on submit
			driver.findElement(Submit).click();
		}
		public void screenshot(String path) throws IOException {//  to take a screenshot
			TakesScreenshot ts=((TakesScreenshot) driver);
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(path));
		}
		public void quit() {// to clos ethe browser
			driver.close();
		}

		
}
