$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SgnIn.feature");
formatter.feature({
  "name": "To cerify the SignIn functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the user profile is signed-in",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is in Wizz home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignIn_Steps.the_user_is_in_Wizz_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is to click the sign in option",
  "keyword": "When "
});
formatter.match({
  "location": "SignIn_Steps.the_user_is_to_click_the_sign_in_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to Sign In window",
  "keyword": "And "
});
formatter.match({
  "location": "SignIn_Steps.the_user_should_navigate_to_Sign_In_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user to enter their mail id and passworn in sign fields",
  "keyword": "And "
});
formatter.match({
  "location": "SignIn_Steps.the_user_to_enter_their_mail_id_and_passworn_in_sign_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "SignIn_Steps.the_user_click_the_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The use should see their profile is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn_Steps.the_use_should_see_their_profile_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});