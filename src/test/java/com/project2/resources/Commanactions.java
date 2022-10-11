package com.project2.resources;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commanactions {
	
	public static WebDriver driver;
	public void launch(String url) {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
	}
	
	public void windowshandling() {
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
			}}}
	public void Inserttext(WebElement ele, String value) {
		ele.sendKeys(value,Keys.ENTER);
	}
    public void impwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
    
    public void takesrnshot(String path) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File file = new File (path);
		FileHandler.copy(as, file);

	}

}
