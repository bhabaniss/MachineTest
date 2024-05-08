package FireFoxDesktop;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Desktop3 {
	@Test
	public void site1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/");
		driver.manage().window().setSize(new Dimension(1536, 864));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Firefox\\Desktop 1536_846");
		driver.close();
	}

	@Test
	public void site2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().setSize(new Dimension(1536, 864));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Firefox\\Desktop 1536_846");
		driver.close();
	}

	@Test
	public void site3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		driver.manage().window().setSize(new Dimension(1536, 864));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Firefox\\Desktop 1536_846");
		driver.close();
	}

	@Test
	public void site4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().window().setSize(new Dimension(1536, 864));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Firefox\\Desktop 1536_846");
		driver.close();
	}

	@Test
	public void site5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().setSize(new Dimension(1536, 864));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Firefox\\Desktop 1536_846");
		driver.close();
	}


}
