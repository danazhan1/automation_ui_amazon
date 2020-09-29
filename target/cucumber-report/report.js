$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resourses/com/app/features/shopping.feature");
formatter.feature({
  "name": "Shopping",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@shopping"
    }
  ]
});
formatter.scenario({
  "name": "To purchase MacBook Pro and Iphone 10 XR cases.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@shopping"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I\u0027m on the HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "Shopping.i_m_on_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I\u0027m looking for a MacBook Pro 13 inch case And Add selected case into shopping cart",
  "keyword": "When "
});
formatter.match({
  "location": "Shopping.i_m_looking_for_a_MacBook_Pro_inch_case_And_Add_selected_case_into_shopping_cart(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I\u0027m looking for Iphone XR case And Add selected Iphone case into shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "Shopping.i_m_looking_for_Iphone_XR_case_And_Add_selected_Iphone_case_into_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check shopping cart And continue shopping",
  "keyword": "Then "
});
formatter.match({
  "location": "Shopping.i_check_shopping_cart_And_continue_shopping()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});