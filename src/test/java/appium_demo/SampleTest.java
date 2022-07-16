package appium_demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

	private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "11.0");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:app", "C:\\Users\\rohit\\Downloads\\ApiDemos-debug.apk");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }

	  @Test
	  public void sampleTest() {
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Views");
		  el1.click();
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Buttons");
		  el2.click();
		  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Small");
		  el3.click();

	  }

	  @After
	  public void tearDown() throws InterruptedException {
		  Thread.sleep(1000);
	    driver.quit();
	  }
	}

