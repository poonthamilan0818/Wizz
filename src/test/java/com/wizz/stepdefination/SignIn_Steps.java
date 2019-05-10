package com.wizz.stepdefination;

import com.wizz.objectrepsitory.SignIn_Page;
import com.wzz.resources.FunctionalLibrary;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class SignIn_Steps extends FunctionalLibrary {
	public static SignIn_Page page;
	@Given("The user is in Wizz home page")
	public void the_user_is_in_Wizz_home_page() {
	   launchUrl("https://wizzair.com/#/");
	}

	@When("The user is to click the sign in option")
	public void the_user_is_to_click_the_sign_in_option() {
		page = new SignIn_Page();
	  click(page.getSignInOption());
	}

	@SuppressWarnings("deprecation")
	@When("The user should navigate to Sign In window")
	public void the_user_should_navigate_to_Sign_In_window() throws InterruptedException {
		sleep(3000);
		page= new SignIn_Page();
	    Assert.assertTrue((FunctionalLibrary.getText(page.getSignInText())).equals("Sign in"));
	}

	@When("The user to enter their mail id and passworn in sign fields")
	public void the_user_to_enter_their_mail_id_and_passworn_in_sign_fields() {
		page= new SignIn_Page();
	   send(page.getSignInEmail(), "poonthamilan0818@gmail.com");
	   send(page.getSignInPassword(), "Thamil@06");
	}

	@When("The user click the Sign in button")
	public void the_user_click_the_Sign_in_button() throws InterruptedException {
		page= new SignIn_Page();
		click(page.getSubmitSignIn());
		sleep(10000);
	}

	@SuppressWarnings("deprecation")
	@Then("The use should see their profile is logged in")
	public void the_use_should_see_their_profile_is_logged_in() throws InterruptedException {
		sleep(10000);
		System.out.println("Done");
//	   Assert.assertTrue(!(FunctionalLibrary.getText(page.getSignInOption())).equals("SIGN IN"));
	}

}
