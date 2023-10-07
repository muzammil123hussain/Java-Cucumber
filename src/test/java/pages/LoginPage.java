package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");


    private final By errorMessageLocator = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");

    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }
    public void navigateToHomePage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocator).getText();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(usernameField).isDisplayed();
    }
}
