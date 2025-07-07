

package Docker;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DockerwithFirefox {

	WebDriver driver;
	@BeforeClass
	public void setup() throws Exception
	{
		FirefoxOptions options= new FirefoxOptions();
		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options );
	}
	@Test
	public void runfirefox()
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
