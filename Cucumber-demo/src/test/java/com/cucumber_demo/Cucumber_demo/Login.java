package com.cucumber_demo.Cucumber_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Login {
	WebDriver dr;
	@Given("Chrome Browser should open")
	public void chrome_browser_should_open() {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\vasishta patel\\Downloads\\chromedriver_win32 (1)");
		//creating an object to access he browser elements	
		 dr= new ChromeDriver();
		 String url="https://www.amazon.in/";
			dr.get(url);
		 dr.manage().window().maximize();
		 //Navigate to the SignIN Page
		 dr.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			
	}
	@Then("Chechk wheather the Created Account Matches with login Credentials or not")
	public void chechk_wheather_the_created_account_matches_with_login_credentials_or_not() throws InterruptedException {
		//Entering the LoginInput
		dr.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(1000);
	   
	}
	@Then("Then Select the Product from electronic and check Wheather the given Product is properly places in the Cart or not.")
	public void then_select_the_product_from_electronic_and_check_wheather_the_given_product_is_properly_places_in_the_cart_or_not() throws InterruptedException {
	  
		//Entering the LoginInput
		
		dr.findElement(By.id("ap_email")).sendKeys("917995422832");
			//Clicking the continue button
		dr.findElement(By.id("continue")).click();
			//Entering the password
		dr.findElement(By.id("ap_password")).sendKeys("vasishtapatel");
			//Clicking on the SignIn Button
		dr.findElement(By.id("signInSubmit")).click();
			//Navigate to the electronic product list
		dr.navigate().to("https://www.amazon.in/s?k=sony+tv&i=electronics&crid=32PU96X1W3V6S&sprefix=sony+tv%2Celectronics%2C299&ref=nb_sb_noss_1");
			//Selecting the product 
		dr.navigate().to("https://www.amazon.in/Sony-Bravia-inches-Google-XR-65X90K/dp/B09ZLNF2N7/ref=sr_1_4?crid=11A9DEQ8VPL1Z&keywords=sony%2Bbravia%2B165&qid=1669350630&qu=eyJxc2MiOiIxLjQ1IiwicXNhIjoiMC4wMCIsInFzcCI6IjAuMDAifQ%3D%3D&s=electronics&sprefix=%2Celectronics%2C216&sr=1-4&th=1");
			//clicking the Cart Button
		dr.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		
	
		dr.navigate().to("https://www.amazon.in/Sony-Bravia-inches-Google-KD-65X74K/dp/B09WN3SRC7/ref=sr_1_1_sspa?crid=32PU96X1W3V6S&keywords=sony+tv&qid=1669350944&qu=eyJxc2MiOiI1LjQ1IiwicXNhIjoiNS4wMyIsInFzcCI6IjMuMjgifQ%3D%3D&s=electronics&sprefix=sony+tv%2Celectronics%2C299&sr=1-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		
		dr.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		
		dr.navigate().to("https://www.amazon.in/Sony-Bravia-inches-KD-32W820K-Compatibility/dp/B09WN4RYGD/ref=sr_1_3?crid=32PU96X1W3V6S&keywords=sony+tv&qid=1669350944&qu=eyJxc2MiOiI1LjQ1IiwicXNhIjoiNS4wMyIsInFzcCI6IjMuMjgifQ%3D%3D&s=electronics&sprefix=sony+tv%2Celectronics%2C299&sr=1-3");
		
		dr.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		
		dr.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
		
			
	    dr.close();
		}
		
}



	



