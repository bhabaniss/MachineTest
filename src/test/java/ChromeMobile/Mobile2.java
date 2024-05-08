package ChromeMobile;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Mobile2 {
	@Test
	public void site1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		driver.manage().window().setSize(new Dimension(414, 896));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Mobile 414×896");
		driver.close();
	}

	@Test
	public void site2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().setSize(new Dimension(414, 896));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Mobile 414×896");
		driver.close();
	}

	@Test
	public void site3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		driver.manage().window().setSize(new Dimension(414, 896));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Mobile 414×896");
		driver.close();
	}

	@Test
	public void site4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().window().setSize(new Dimension(414, 896));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Mobile 414×896");
		driver.close();
	}

	@Test
	public void site5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().setSize(new Dimension(414, 896));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Mobile 414×896");
		driver.close();
	}
	

}
