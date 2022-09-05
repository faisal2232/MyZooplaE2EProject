package zoopla.uk.Elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.basepage.BasePage;

public class LogineElementpage extends BasePage{
	
	public LogineElementpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")
	@CacheLookup
	private WebElement clickOnSignButton;
	
	public WebElement getClickOnSignButton() {
	return clickOnSignButton;
	}
	
	@FindBy(xpath = "//*[@id='email']")
	@CacheLookup
	private WebElement getMyUsername;
	
	public WebElement getMyUsername() {
	return getMyUsername;
	}
	
	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	private WebElement getMyPassword;
	
	public WebElement getMyPassword() {
	return getMyPassword;
	}
	
	@FindBy(xpath = "(//*[contains(@class,'klmMZv')])[4]")
	@CacheLookup
	private WebElement getMySignIN;
	
	public WebElement getMySignIN() {
	return getMySignIN;
	}
	
	@FindBy(xpath = "//*[text()='Welcome back to your account']") 
	@CacheLookup
	private WebElement myText;
	
	public WebElement  getMyText() {
	return   myText;
	
	}
	@FindBy(xpath = "//*[@class='c-dCnEbb']") 
	@CacheLookup
	private WebElement signOut2;
	
	public WebElement  gesignOut2() {
	return   signOut2;
	
	}

	public void getMyUserNameAndPWD(String MyName,String MyPWD) { //to get my password and username
		getMyUsername().sendKeys(MyName);
		getMyPassword().sendKeys(MyPWD);
	}
}
