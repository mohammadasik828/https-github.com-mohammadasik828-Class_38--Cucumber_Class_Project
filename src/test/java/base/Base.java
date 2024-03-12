package base;

import com.microsoft.playwright.Page;

public class Base {
	public static Page page;
	public static String url = "https://it.microtechlimited.com";

	public static String hasText(String locator, String key) {
		return page.locator(locator).getAttribute(key);
	}

	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}

	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}

	public static void navigate(String url) {
		page.navigate(url);
	}

	public static void click(String locator) {
		page.locator(locator).click();
	}

	public static void p(String s) {
		System.out.println("MMMMMMMMMMMMMMMMMMMM");
	}

}
