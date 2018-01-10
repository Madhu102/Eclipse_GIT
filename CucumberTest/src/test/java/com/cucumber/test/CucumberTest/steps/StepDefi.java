package com.cucumber.test.CucumberTest.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefi {
		
		@Given("^I am in login page of facebook$")
		public void i_am_in_login_page_of_facebook() throws Throwable {
			 System.setProperty("webdriver.chrome.driver","E:\\Nisum\\chromedriver.exe");
			  ChromeDriver driver=new ChromeDriver();

			        driver.get("https://www.facebook.com/");
			        Thread.sleep(5000);
			        driver.manage().window().maximize();
			        Thread.sleep(5000);
			    
		    throw new PendingException();
		}

		@When("^I enter the user name$")
		public void i_enter_the_user_name() throws Throwable {
			driver.findElement(By.name("user name")).sendKeys("mk_vuppugalla@yahoo.com");
			Thread.sleep(5000);
		    throw new PendingException();
		}

		@When("^I enter the password$")
		public void i_enter_the_password() throws Throwable {
			driver.findElement(By.name("Password")).sendKeys("Forgot@143");
			Thread.sleep(5000);
		    throw new PendingException();
		}

		@Then("^I click on Login button\\.$")
		public void i_click_on_Login_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^i am in Facebook wall\\.$")
		public void i_am_in_Facebook_wall() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

	}


