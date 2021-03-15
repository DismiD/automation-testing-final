package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//div[@id='srp-river-results']//div[@class='s-item__wrapper clearfix']")
    private List<WebElement> productList;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean productListContainsSearchText(final String searchText) {
        for (WebElement element : productList) {
            if (!element.getText().contains(searchText))
                return false;
        }
        return true;
    }

}
