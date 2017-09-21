package junitcucumber;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class MYtest { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      driver = new FirefoxDriver(); 
   } 
	
   @Given("^I have open the browser$")
   public void i_have_open_the_browser() throws Throwable {
	   driver.navigate().to("http://localhost:7890/TestMe/login.html"); 
   }

   @When("^I open Login website$")
   public void i_open_Login_website() throws Throwable {
    System.out.println("I Opended");   
   }

   @Then("^Login button should exits$")
   public void login_button_should_exits() throws Throwable {
	   if(driver.findElement(By.id("submit")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      driver.close();     
   }


}