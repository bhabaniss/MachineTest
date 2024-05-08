package ChromeDesktop;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Desktop1

//chrome browser & the resolution is 1920*1080
{

	@Test
	public void site1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		driver.manage().window().setSize(new Dimension(1920, 1080));

		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Desktop 1920_1080");
		driver.close();
	}

	@Test
	public void site2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Desktop 1920_1080");
		driver.close();
	}

	@Test
	public void site3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-pro-features/");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Desktop 1920_1080");
		driver.close();
	}

	@Test
	public void site4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Desktop 1920_1080");
		driver.close();
	}

	@Test
	public void site5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		Shutterbug.shootPage(driver, Capture.FULL, true).save("D:\\Automation-Task\\Chrome\\Desktop 1920_1080");
		driver.close();
	}
	

}
