package step_definations;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterSuite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import base.Base;

import com.microsoft.playwright.BrowserType.LaunchOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before
	public void startUp() {
		System.out.println("Before Suite");

		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		page = context.newPage();
	}

	@After
	public void tearDown() {
		System.out.println("AfterSuite ");
		page.close();
	}
}
