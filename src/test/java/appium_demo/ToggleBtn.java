package appium_demo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ToggleBtn {
	
	 private AndroidDriver<MobileElement> driver;

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

	    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	  
	  }

	  @Test
	  public void sampleTest() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Controls']")).click();
		    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		    
		 //CTRL +2 , L 
		  MobileElement TButton = driver.findElement(By.className("android.widget.ToggleButton"));
		    System.out.println(TButton.getAttribute("text"));
		    String strText = TButton.getAttribute("text");
		    Assert.assertEquals("OFF", strText);
		    TButton.click();
		    System.out.println(TButton.getAttribute("text"));
		    
			  }
	  
		   @After
			  public void tearDown() throws InterruptedException {
				  
				  Thread.sleep(1000);
				  
			    driver.quit();
			  }
	  }
	  

