package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchResultsPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    private WebDriver driver;
    private PageFactoryManager pageFactoryManager;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;


    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks search field visibility")
    public void userChecksSearchFieldVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isSearchFieldVisible());
    }

    @When("User makes search by keyword {string}")
    public void userMakesSearchByKeywordKeyword(final String searchText) {
        homePage.enterTextToSearchField(searchText);

    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("User checks that products in a search list contains keyword {string}")
    public void userChecksThatProductsInASearchListContainsKeywordKeyword(final String keyword) {
       searchResultsPage = pageFactoryManager.getSearchResultsPage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
      assertTrue(searchResultsPage.productListContainsSearchText(keyword));
    }
}
