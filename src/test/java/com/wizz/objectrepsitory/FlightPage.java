package com.wizz.objectrepsitory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wzz.resources.FunctionalLibrary;

public class FlightPage extends FunctionalLibrary {
	public FlightPage() {
		PageFactory.initElements(driver, this);
	}
//DESTINATION AND ORIGIN
	@FindBy(id = "search-departure-station")
	private WebElement origin;
	@FindBy(id = "search-arrival-station")
	private WebElement destination;
//DATE
	@FindBy(id = "search-departure-date")
	private WebElement departureDate;
	@FindBy(id = "search-return-date")
	private WebElement returnBox;

	@FindBy(tagName = "td")
	private List<WebElement> Datepick;
//ONE WAY
	@FindBy(xpath = "//button[text()=' One way only ']")
	private WebElement OneWay;
	@FindBy(xpath = "//button[text()=' One way only ']//following-sibling::button")
	private WebElement Okdate;
//PASSENGER INFO
	@FindBy(id = "search-passenger")
	private WebElement SelectPassenger;

	@FindBy(xpath = "(//button[contains(@class,'-add')])[1]")
	private WebElement SelectAdultPassenger;
	@FindBy(xpath = "(//button[contains(@class,'-add')])[2]")
	private WebElement SelectChildPassenger;
	@FindBy(xpath = "(//button[contains(@class,'-add')])[3]")
	private WebElement SelectInfantPassenger;

	@FindBy(xpath = "(//button[contains(@class,'-subtract')])[1]")
	private WebElement DeSelectadultPassenger;
	@FindBy(xpath = "(//button[contains(@class,'-subtract')])[2]")
	private WebElement DeSelectChildpassenger;
	@FindBy(xpath = "(//button[contains(@class,'-subtract')])[3]")
	private WebElement DeSelectInfantPassenger;
//SESSION TIMEOUT
	@FindBy(xpath = "(//button[contains(text(),' Restart booking ')])[1]")
	private WebElement SessionRestartBooking;
	//VALIDATE TIMEOUT
	@FindBy(xpath = "(//button[contains(text(),' Restart booking ')])[2]")
	private WebElement ValidateRestartBooking;
//FLICHT SEARCH
	@FindBy(xpath = "//button[contains(@data-test,'flight-search-submit')]")
	private WebElement Search;
//FLIGHT SELECTION
	@FindBy(className = "flight-select__flight")
	private WebElement SelectFlights;
	@FindBy(xpath = "(//div[@data-test='fare-type-button'])[1]")
	private WebElement BasicFare;
	@FindBy(xpath = "(//div[@data-test='fare-type-button'])[3]")
	private WebElement middleFare;
	@FindBy(xpath = "(//div[@data-test='fare-type-button'])[5]")
	private WebElement HighFare;
	@FindBy(id = "flight-select-continue-button")
	private WebElement Continue;
//PASSENGER DETAILS
	@FindBy(id = "passenger-first-name-0")
	private WebElement FirstName;
	@FindBy(id = "passenger-last-name-0")
	private WebElement LastName;
	@FindBy(xpath = "//label[contains(@data-test,'gender-0-female')]")
	private WebElement SelectFemaleGender;
	@FindBy(xpath = "//label[contains(@data-test,'gender-0-male')]")
	private WebElement SelectMaleGender;

	@FindBy(xpath = "(//button[contains(@data-test,'outbound-heavy-increment')])[1]")
	private WebElement Above30CheckedIn;
	@FindBy(xpath = "(//button[contains(text(),' OK ')])[2]")
	private WebElement PassengersOk;
	@FindBy(id = "passengers-continue-btn")
	private WebElement PassengerContinue;

}
