Feature: Login to SauceDemo

  Scenario: Unsuccessful login with invalid username
    Given I am on the SauceDemo login page
    When I enter username "invalid_user" and password "secret_sauce"
    And I click the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Unsuccessful login with invalid password
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce_invalid"
    And I click the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: Successful login
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click the login button
    Then I should be on the products page

  Scenario: Add a product to the cart
    Given I am logged in with valid credentials
    When I add the first product to the cart
    Then I should see the product in the cart

  Scenario: Logout
    Given Menu icon is visible
    When I click the menu icon
    And I click the logout button
    Then I should be logged out and on the login page