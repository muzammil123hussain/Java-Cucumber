package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
    private final By cartLink = By.className("shopping_cart_link");
    private final By cartItem = By.className("cart_item");

    public void navigateToCart() {
        driver.findElement(cartLink).click();
    }

    public boolean isProductInCart() {
        return !driver.findElements(cartItem).isEmpty();
    }
}
