package appium_demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

	public class Dropdownspinner {

	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "11.0");
	    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
	    desiredCapabilities.setCapability("appium:appPackage", "io.appium.android.apis");
	    desiredCapabilities.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
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
	    (new TouchAction(driver))
	      .press(PointOption.point(606, 1851))
	      .moveTo(PointOption.point(640, 350))
	      .release()
	      .perform();
	    (new TouchAction(driver))
	      .press(PointOption.point(531, 1769))
	      .moveTo(PointOption.point(561, 892))
	      .release()
	      .perform();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Spinner");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("io.appium.android.apis:id/spinner1");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("io.appium.android.apis:id/spinner2");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	    el6.click();
	    }

	  @After
	  public void tearDown() throws InterruptedException {
		  
		  Thread.sleep(1000);
		  
	    driver.quit();
	  }
	}
	
	

