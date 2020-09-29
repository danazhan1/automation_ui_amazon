
@shopping
Feature: Shopping


  Scenario: To purchase MacBook Pro and Iphone 10 XR cases.
    Given I'm on the HomePage
    When I'm looking for a MacBook Pro 13 inch case And Add selected case into shopping cart
    And I'm looking for Iphone XR case And Add selected Iphone case into shopping cart   
    Then I check shopping cart And continue shopping
   