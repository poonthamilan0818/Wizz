package com.wizz.objectrepsitory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wzz.resources.FunctionalLibrary;

public class SignIn_Page extends FunctionalLibrary {
	public SignIn_Page() {
		PageFactory.initElements(driver, this);
	}

	// EXISTING USER SIGNIN
	@FindBy(xpath = "//button[@data-test='navigation-menu-signin']")
	private WebElement SignInOption;
	@FindBy(xpath="//h2[text()=' Sign in ']")
	private WebElement SignInText;
	@FindBy(xpath = "//input[@data-test='login-modal-email']")
	private WebElement SignInEmail;
	@FindBy(xpath = "//input[@data-test='login-modal-password']")
	private WebElement SignInPassword;
	@FindBy(xpath = "//button[@data-test='loginmodal-signin']")
	private WebElement SubmitSignIn;
	@FindBy(xpath = "//button[@data-test='loginmodal-registration']")
	private WebElement CancelSignIn;

	// AGENCY LOGIN
	@FindBy(xpath = "//a[text()=' Agency login ']")
	private WebElement AgencyLogin;

	// FORGOT PASSWORD
	@FindBy(xpath = "//button[text()=' Forgot your password? ']")
	private WebElement ForgotPassword;

	// NEW REGiSTRATION
	@FindBy(xpath = "//button[text()='Registration']")
	private WebElement NewRegistration;
	@FindBy(name = "firstName")
	private WebElement SignUpFirstName;
	@FindBy(xpath = "//input[@name='lastName'and @placeholder='Last name']")
	private WebElement SignUpLastName;
	@FindBy(xpath = "//label[@data-test='register-genderfemale']")
	private WebElement FemaleGender;
	@FindBy(xpath = "//label[@data-test='register-gendermale']")
	private WebElement MaleGender;
	@FindBy(xpath = "(//div[contains(text(),' Country code ')])")
	private WebElement CountryCode;
	@FindBy(xpath = "//input[@type='text'and@placeholder='Search...']")
	private WebElement CountrySearch;
	@FindBy(name = "phoneNumberValidDigits")
	private WebElement MobileNo;
	@FindBy(xpath = "//input[@data-test='booking-register-email']")
	private WebElement RegisterEmail;
	@FindBy(xpath = "//input[@data-test='booking-register-password']")
	private WebElement NewPassWord;
	@FindBy(xpath = "//input[@data-test='booking-register-country']")
	private WebElement Nationality;
	@FindBy(xpath = "//input[@id='registration-special-offers-checkbox']//following-sibling::label[1]")
	private WebElement NewsLetterCkBox;
	@FindBy(xpath = "//input[@id='registration-privacy-policy-checkbox']//following-sibling::label[1]")
	private WebElement AcceptCkBox;
	@FindBy(xpath = "//button[@data-test='booking-register-submit']")
	private WebElement SumittRegister;
	public WebElement getSignInOption() {
		return SignInOption;
	}
	
	public WebElement getSignInText() {
		return SignInText;
	}

	public WebElement getSignInEmail() {
		return SignInEmail;
	}
	public WebElement getSignInPassword() {
		return SignInPassword;
	}
	public WebElement getSubmitSignIn() {
		return SubmitSignIn;
	}
	public WebElement getCancelSignIn() {
		return CancelSignIn;
	}
	public WebElement getAgencyLogin() {
		return AgencyLogin;
	}
	public WebElement getForgotPassword() {
		return ForgotPassword;
	}
	public WebElement getNewRegistration() {
		return NewRegistration;
	}
	public WebElement getSignUpFirstName() {
		return SignUpFirstName;
	}
	public WebElement getSignUpLastName() {
		return SignUpLastName;
	}
	public WebElement getFemaleGender() {
		return FemaleGender;
	}
	public WebElement getMaleGender() {
		return MaleGender;
	}
	public WebElement getCountryCode() {
		return CountryCode;
	}
	public WebElement getCountrySearch() {
		return CountrySearch;
	}
	public WebElement getMobileNo() {
		return MobileNo;
	}
	public WebElement getRegisterEmail() {
		return RegisterEmail;
	}
	public WebElement getNewPassWord() {
		return NewPassWord;
	}
	public WebElement getNationality() {
		return Nationality;
	}
	public WebElement getNewsLetterCkBox() {
		return NewsLetterCkBox;
	}
	public WebElement getAcceptCkBox() {
		return AcceptCkBox;
	}
	public WebElement getSumittRegister() {
		return SumittRegister;
	}

	
}
