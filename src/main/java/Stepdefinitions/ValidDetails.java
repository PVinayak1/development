package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePackage.defaults;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidDetails extends defaults {

	WebDriver driver = defaults.setDefaults();

	@Given("^I opened the browser$")
	public void i_opened_the_browser() throws Throwable {
	driver.get

	}

	@When("^the portal is launched$")
	public void the_portal_is_launched() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/div/label/span")).click();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		// driver.switchTo().frame("//*[@id=\"login_header_disable\"]/div/div[2]/div[2]/div/div[2]/div[3]");
		driver.findElement(By.name("userId")).sendKeys("Siddish");
		driver.findElement(By.name("pwd")).sendKeys("Test1234");

	}

}
