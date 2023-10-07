package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("I am on the SauceDemo login page")
    public void iAmOnTheSauceDemoLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Then("I should be on the products page")
    public void iShouldBeOnTheProductsPage() {
    }

    @Given("I am logged in with valid credentials")
    public void iAmOnTheSauceDemoHomePage() {
        loginPage.navigateToHomePage();
    }

    @When("I add the first product to the cart")
    public void iAddTheFirstProductToTheCart() {
        productPage.clickProductItem(0);
        productPage.clickAddToCartButton();
    }

    @Then("I should see the product in the cart")
    public void iShouldSeeTheProductInTheCart() {
        cartPage.navigateToCart();
        assertTrue(cartPage.isProductInCart());
    }

    @Given("Menu icon is visible")
    public void menuIconIsVisible() {
        loginPage.navigateToHomePage();
    }

    @When("I click the menu icon")
    public void iClickTheMenuIcon() {
        productPage.clickMenuIcon();
    }

    @And("I click the logout button")
    public void iClickTheLogoutButton() {
        productPage.clickLogoutButton();
    }

    @Then("I should be logged out and on the login page")
    public void iShouldBeLoggedOutAndOnTheLoginPage() {
        assertTrue(loginPage.isLoginPageDisplayed());
    }

}
