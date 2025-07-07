package Docker;

import java.net.URL;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DockerwithChrome {
	WebDriver driver;

	
	
	@BeforeClass
	public void setup() throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");

		// Add this line to avoid profile conflicts
		options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());

		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
	}

	@Test
	public void runchrome()
	{

		driver.get("https://www.amazon.in");
		System.out.println("Title of the page is: " +driver.getTitle());
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}

