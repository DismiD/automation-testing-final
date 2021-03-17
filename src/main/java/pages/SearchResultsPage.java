package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    private static final int FIRST_PRODUCT_IN_PRODUCT_LIST = 0;
    @FindBy(xpath = " //div[@id='srp-river-results']//a[@class ='s-item__link']")
    private List<WebElement> productList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean productListContainsSearchText(final String searchText) {
        for (WebElement element : productList) {
            if (!element.getText().toLowerCase().contains(searchText.toLowerCase()))
                return false;
        }
        return true;
    }

    public void clickOnFirstProductInProductList() {
        new Actions(driver).doubleClick(productList.get(FIRST_PRODUCT_IN_PRODUCT_LIST)).build().perform();
    }

    public String getFirstProductInProductListTitle() {
        return productList.get(FIRST_PRODUCT_IN_PRODUCT_LIST).getText();
    }
}
