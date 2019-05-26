package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static WebDriver driver;
	public static String url = "http://www.google.com/";
	public static void setUpDriver(String browser, String url) {//creating a parameterized method with the browser and URL
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", "src/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Browser given is not in system liberary");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				break;
			} else {
				System.out.println("Option with text “+text+” is not available");
			}
		}
	}

	public static void selectValueFromDD(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		if (options.size() > index) {
			select.selectByIndex(index);
		} else {
			System.out.println("Invalid index has been passed");
		}
	}

	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
}
/**
 * 
 * 
 */
