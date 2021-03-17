package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class ='grid__group details']")
    private List<WebElement> productListInCart;

    public int numberOfProductsInCart() {
        return productListInCart.size();
    }

    public boolean isProductListInCartContainsAddedProduct(final String addedProductTitle) {
        for (WebElement element : productListInCart) {
            if (!element.getText().toLowerCase().contains(addedProductTitle.toLowerCase()))
                return false;
        }
        return true;
    }
}
