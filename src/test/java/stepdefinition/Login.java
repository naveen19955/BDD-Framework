package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Login {
	
	WebDriver driver;
	
	@Given("User must be on homepage by cliking url {string}")
	public void user_must_be_on_homepage_by_cliking_url(String string) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(string);
	    Thread.sleep(2000);
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
	    driver.findElement(By.id("username")).sendKeys(username);
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys(password);
	  
	}

	@When("Click on sign in button")
	public void click_on_sign_in_button() {
	    driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {
      String  actualresult = driver.getCurrentUrl();
      Assert.assertEquals("https://demo.applitools.com/app.html", actualresult);
      driver.close();
	}
	
	

}
