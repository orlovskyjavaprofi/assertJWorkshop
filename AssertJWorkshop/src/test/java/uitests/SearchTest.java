package uitests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import assertelems.pages.SearchPage;

public class SearchTest extends BaseTest {
	private SearchPage searchPage;

	@BeforeTest
	public void pageSetup() {
		this.searchPage = new SearchPage(driver);
	}

	@Test
	public void launchSite() {
		this.searchPage.goTo();
		assertThat(this.searchPage).isAt();
	}

	@Test(dependsOnMethods = "launchSite")
	public void keywordTest() {
		this.searchPage.search("clean coders");
		assertThat(this.searchPage.getSearchBox())
				.isEnabled().isDisplayed()
				.hasAttributeValue("value",
						"clean coders");
	}
}
