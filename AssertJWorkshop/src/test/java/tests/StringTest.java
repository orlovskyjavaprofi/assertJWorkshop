package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
//For this test you need TestNG runner
public class StringTest {

	@Test(dataProvider = "simpledataprovidertest")
	void stringTest(
			String input) {
		assertSoftly(
				softAssertions -> {
					softAssertions
							.assertThat(input)
							.hasSize(8)
							.startsWith("se")
							.doesNotContain("api")
							.doesNotContainAnyWhitespaces()
							.containsOnlyOnce("i");
				});
	}

	@DataProvider(name = "simpledataprovidertest")
	public Object[] getData() {
		return new String[]{
				"selenium",
				"selenide",
		};
	}
}
