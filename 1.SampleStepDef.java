package stepDef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStepDef {
	WebDriver driver = null;
	@Given("As a user, I should open Chrome Browser")
	public void as_a_user_i_should_open_chrome_browser() {
	    System.out.println("Open Chrome Browser Succesfully");
	    driver = new ChromeDriver();
	    WebElement fName = driver.findElement(By.name("First_Name"));
	    String colour = fName.getCssValue("style");
	    String hex = Color.fromString(colour).asHex();
	}

	@Given("As a user, I should open HMS url")
	public void as_a_user_i_should_open_hms_url() {
	    System.out.println("Open HMS URL");
	    driver.get("https://nursingdemo.medifox.in.net/Account/Login");
	}

	@When("As a user, I enter username")
	public void as_a_user_i_enter_username() {
	    System.out.println("I enter user name succesfully");
	    driver.findElement(By.id("Username")).sendKeys("Admin");
	}

	@When("As a user, I enter password")
	public void as_a_user_i_enter_password() {
		System.out.println("I enter password succesfully");
		driver.findElement(By.id("Password")).sendKeys("admin");
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
	@Then("As a user, i should not navigate to dashboard page")
	public void as_a_user_i_should_not_navigate_to_dashboard_page() {
		if(!driver.findElement(By.linkText("Patient Management")).isDisplayed()) {
			System.out.println("I have not navigate to dashboard page succesfully");
		}
	}
}
