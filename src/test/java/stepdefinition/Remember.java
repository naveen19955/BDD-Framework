package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Remember {
	
	WebDriver driver;
	
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	    Thread.sleep(2000);
	}

	@When("User clicks on remember me box")
	public void user_clicks_on_remember_me_box() {
		driver.findElement(By.className("form-check-input")).click();

	}

	@Then("Remember me checkbox must be selected")
	public void remember_me_checkbox_must_be_selected() {
	   boolean a = driver.findElement(By.className("form-check-input")).isSelected();
	   System.out.println(a);
	}

}
