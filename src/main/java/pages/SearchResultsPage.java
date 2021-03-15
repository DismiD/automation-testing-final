package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//div[@id='srp-river-results']//h3[contains(@class, 's-item__title')]")
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

}
