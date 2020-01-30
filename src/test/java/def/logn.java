package def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logn {
	WebDriver driver;
	@When("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2a.04.30\\Desktop\\C2A.04.30_Testing\\Sel-Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
	}

	@When("user navigates to application")
	public void user_navigates_to_application() {
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user navigates the signin page")
	public void user_navigates_the_signin_page() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters the user name")
	public void user_enters_the_user_name() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
	    
	}
	@Then("validate login success")
	public void validate_login_success() {
		Assert.assertEquals(driver.getTitle(),"Home");	
	    
	}


}
