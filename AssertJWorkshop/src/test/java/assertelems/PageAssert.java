package assertelems;

import org.assertj.core.api.AbstractAssert;

import assertelems.pages.BasePage;

public class PageAssert
		extends
			AbstractAssert<PageAssert, BasePage> {

	public PageAssert(BasePage actual) {
		super(actual, PageAssert.class);
	}
	public static PageAssert assertThat(
			BasePage page) {
		return new PageAssert(page);
	}

	public PageAssert isAt() {
		isNotNull();
		if (!actual.isAt()) {
			failWithMessage("Page is not displayed");
		}
		return this;
	}


}
