package com.wizz.stepdefination;

import com.wzz.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
@Before
public static void method1() {
		FunctionalLibrary.driverInit("chrome");
	}
@After
public static void method2() {
	FunctionalLibrary.closeBrowser();
	FunctionalLibrary.quitBrowser();
}
}
