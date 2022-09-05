package zoopla.uk.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
import zoopla.uk.basepage.BasePage;

public class CommonUtility extends BasePage{
	public static void getMyActionClick(WebElement clicker) {
		Actions click = new Actions(driver);
		click.click(clicker).build().perform();
	}
	public static void getJSEClick(WebElement clicker) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clicker);
	}
	public static void getVerifyMyResults(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
				
		if (Expected.equals(Actual)){
		System.out.println("Expected and Actual Match");
		}else{
		System.out.println("Expected and Actual doesnt not Match");
	}
	}
}
