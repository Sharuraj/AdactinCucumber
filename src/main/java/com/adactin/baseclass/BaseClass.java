package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Sweetu\\eclipse-workspace\\SeleniumTrial\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Sweetu\\eclipse-workspace\\SeleniumTrial\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Broswer");
			}
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void waitForElement(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickElement(WebElement element) {
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void moveToFrame(int value) {
	
		try {
			driver.switchTo().frame(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void selectDropDown(WebElement element, String value, String option) {
		//waitForElement(element);
		Select s= new Select(element);
		try {
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);	
			}
			else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			}
			else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		

	}

	public static void closeSession() {

		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateTo(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateBack() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateForward() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateRefresh() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quitSession() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElement(WebElement element, String value) {
		waitForElement(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isDisplayed(WebElement element) {
		waitForElement(element);

		try {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isEnabled(WebElement element) {
		waitForElement(element);
		try {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isSelected(WebElement element) {
		waitForElement(element);
		try {
			boolean selected = element.isSelected();
			System.out.println(selected);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitle() {

		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getCurrentUrl() {

		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isMultiple(WebElement element) {
		waitForElement(element);

		try {
			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void simAlert() {

		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void getScreenShot(String filename) throws IOException {
		
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File(System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png");
			FileUtils.copyFile(srcfile, destfile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

}
