package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {

	WebDriver driver;
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		}
	
	@When("User Search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Java Tutorial");
		search.submit();
		}
	 
	@Then("Should display Java Result Page")
	public void should_display_java_result_page() {
		String strTitle = driver.getTitle();
		Assert.assertEquals("Java Tutorial - Google Search", strTitle);
	}

}
