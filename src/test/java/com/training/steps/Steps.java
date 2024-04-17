package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	static WebDriver driver;
	@Given("user is on salesforce application")
	public void user_is_on_salesforce_application() {
		if(driver==null) {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		}
	   driver.manage().window().maximize();
	   driver.get("https://login.salesforce.com/");
	   
	}
	@Then("user enter the valid username {string}")
	public void user_enter_the_valid_username(String username) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.id("username")).sendKeys(username);
	}
	@Then("user enter the valid password {string}")
	public void user_enter_the_valid_password(String password) {
		 driver.findElement(By.id("password")).sendKeys(password);
	}
	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	   
	}
	@Then("click on usermenudropdown")
	public void click_on_usermenudropdown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.id("userNavButton")).click();
	}
	
	
	
     @After
	  public static void teardown()
	  {
		  driver.close();
		  driver=null;
	  }

}
