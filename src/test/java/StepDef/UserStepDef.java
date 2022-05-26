package StepDef;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserStepDef {
WebDriver driver;
@Given("User is on Login Page") 
public void user_is_on_login_page() 
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}

@When("User enters login credentials")
public void user_enters_login_credentials() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.className("radius")).click();
}
@Then("User should be navigated to home page")
public void user_should_be_navigated_to_home_page() {
	boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	Assert.assertTrue(isValid);
}



	

}
