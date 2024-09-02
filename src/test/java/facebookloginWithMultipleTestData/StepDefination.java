package facebookloginWithMultipleTestData;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;

@Given("facbook login patge alraeday open")
public void facbook_login_patge_alraeday_open() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}

@When("the user enters {string} and {string}")
public void enter_id_pass_then_after_click_on_login_button(String username, String password) throws InterruptedException {

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebElement ID = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	ID.clear();
	ID.sendKeys(username);
	
	WebElement PASS = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	PASS.clear();
	PASS.sendKeys(password);
	
	Thread.sleep(6000);
	
	WebElement LoginButton = driver.findElement(By.xpath("//button[@name=\"login\"]"));
	LoginButton.click();
	
}

@Then("we got laded on login page")
public void we_got_laded_on_login_page() throws InterruptedException {

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
Thread.sleep(6000);
	
	WebElement HomeDashbord = driver.findElement(By.xpath("//a[@aria-label=\"Home\"]"));
	boolean result = HomeDashbord.isDisplayed();
	
	Assert.assertTrue(result);

}
}
