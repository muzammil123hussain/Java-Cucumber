package pages;
import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private final By addToCartButton = By.className("btn_inventory");
    private final By productItem = By.className("inventory_item");
    private final By menuIcon = By.id("react-burger-menu-btn");
    private final By logoutButton = By.id("logout_sidebar_link");

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }
    public void clickProductItem(int index) {
        List<WebElement> products = driver.findElements(productItem);
        products.get(index).click();
    }

    public void clickMenuIcon() {
        driver.findElement(menuIcon).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}
