package step_definations;

import static org.testng.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Subscription_Form_Heading_Validation extends Base {
	@Given("I am in Employee Subscription Page")
	public void i_am_in_employee_subscription_page() {
		navigate("https://it.microtechlimited.com");
		String expectedTitle = "MicroTech NA";
		String actualTitle = page.title();
		assertEquals(actualTitle, expectedTitle);
	}

	@When("I load the page in browser")
	public void i_load_the_page_in_browser() {
		String text = innerText("body > div:nth-child(5) > h1");
		assertEquals(text, "Welcome to MicroTech NA.");
	}

	@Then("verify the page Title is {string}")
	public void verify_the_page_title_is(String string) {
		String headingtext = innerText("body > div:nth-child(5) > h1");
		assertEquals(headingtext, "Welcome to MicroTech NA.");
	}
	@Then("I can see then link of my Login Page")
	public void i_can_see_then_link_of_my_login_page() {
	    String displayed=innerText("//a[@href='elogin.php']");
	    assertEquals(displayed,true);
	}
}
