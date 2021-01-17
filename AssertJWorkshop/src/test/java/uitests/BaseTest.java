package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import assertelems.PageAssert;
import assertelems.WebElementAssert;
import assertelems.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

	protected WebElementAssert assertThat(
			WebElement element) {
		return WebElementAssert.assertThat(element);
	}

	protected PageAssert assertThat(
			BasePage basePage) {
		return PageAssert.assertThat(basePage);
	}

	@AfterTest
	public void quit() {
		this.driver.quit();
	}

}
