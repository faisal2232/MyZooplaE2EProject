package zoopla.uk.stepdefinitions;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zoopla.uk.Elementpage.LogineElementpage;
import zoopla.uk.basepage.BasePage;
import zoopla.uk.generic.CommonUtility;

public class LoginTest extends BasePage {
	LogineElementpage pf;
	
	@Given("^User able to open any browsers\\.$")
	public void user_able_to_open_any_browsers()  {
	logger.info("User able to open any browsers\\\\.$");
	BasePage.initializations();
	pf = new LogineElementpage();
	    
	}

	@And("^User able enter \"([^\"]*)\" URL$")
	public void user_able_enter_URL(String URL)  {
	logger.info("User able enter \\\"([^\\\"]*)\\\" URL$");
	driver.get(URL);    
	    
	}

	@When("^user able to click sign in button$")
	public void user_able_to_click_sign_in_button()  {
	logger.info("^user able to click sign in button$");
	pf.getClickOnSignButton().click();	    
	    
	}

	@And("^User able to enter username$")
	public void user_able_to_enter_username()  {
	logger.info("^User able to enter username$");
	//    pf.getMyUsername().sendKeys("israil2@yahoo.com");
	    
	}

	@And("^User able to enter password$")
	public void user_able_to_enter_password()  {
	logger.info("^User able to enter password$");
	 //   pf.getMyPassword().sendKeys("Manik2232");
		pf.getMyUserNameAndPWD(prop.getProperty("userName"),prop.getProperty("pwd"));
	}

	@When("User able to click login in button")
	public void user_able_to_click_login_in_button() {
	logger.info("User able to click login in button");
		Actions click = new Actions(driver);
		click.click(pf.getMySignIN()).build().perform();
	    
	}

	@Then("User able to verify the user information {string} on the UI and LogOut")
	public void user_able_to_verify_the_user_information_on_the_ui_and_log_out(String text) {
	logger.info("User able to verify the user information {string} on the UI and LogOut");
		CommonUtility.getVerifyMyResults(text, pf.getMyText().getText());
		pf.gesignOut2().click();
		driver.quit();
	}

	
	    
	

	
	
	
	
}
