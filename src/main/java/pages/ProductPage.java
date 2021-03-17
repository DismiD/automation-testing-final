package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id ='isCartBtn_btn']")
    private WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public boolean isAddToCartButtonVisible() {
        return addToCartButton.isDisplayed();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }
}
