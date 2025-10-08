package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithTestDataSourceStepDef {
	WebDriver driver = null;
	@Given("As a user, I should open {string} Browser")
	public void as_a_user_i_should_open_browser(String string) {
		driver = new ChromeDriver();
	}

	@Given("As a user, I should open HMS {string} url")
	public void as_a_user_i_should_open_hms_url(String url) {
		driver.get(url);
	}

	@When("As a user, I enter {string} username")
	public void as_a_user_i_enter_username(String user) {
		driver.findElement(By.id("Username")).sendKeys(user);
	}

	@When("As a user, I enter {string} password")
	public void as_a_user_i_enter_password(String pass) {
		driver.findElement(By.id("Password")).sendKeys(pass);
	}
	@When("As a user, I click on login button")
	public void as_a_user_i_click_on_login_button() {
		System.out.println("I click on login button succesfully");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("As a user, i should navigate to dashboard page")
	public void as_a_user_i_should_navigate_to_dashboard_page() {
		if(driver.findElement(By.linkText("Patient Management")).isDisplayed()) {
			System.out.println("I navigate to dashboard page succesfully");
		}
	}
}
