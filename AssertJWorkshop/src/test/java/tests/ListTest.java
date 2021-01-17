package tests;



import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


class ListTest {

	@Test(dataProvider = "simpledataprovidertest")
	void stringTest(List<String> input) {
		List<String> expected = Arrays.asList("apple",
				"ball");
		assertThat(input).hasSize(3)
				.doesNotContain("cat")
				.containsAll(expected);
	}

	@DataProvider(name = "simpledataprovidertest")
	public Object[] getData() {
		return new Object[]{
				Arrays.asList("ball", "apple", "car")};
	}

}
