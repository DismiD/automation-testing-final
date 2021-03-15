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

    @And("User checks header visibility")
    public void userChecksHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(homePage.isHeaderVisible());
    }

    @And("User checks footer visibility")
    public void userChecksFooterVisibility() {
        assertTrue(homePage.isFooterVisible());
    }

    @And("User checks cart visibility")
    public void userChecksCartVisibility() {
        assertTrue(homePage.isCartIconVisible());
    }

    @And("User checks that notification icon visibility")
    public void userChecksThatNotificationIconVisibility() {
        assertTrue(homePage.isNotificationButtonVisible());
    }

    @And("User checks register button visibility")
    public void userChecksRegisterButtonVisibility() {
        assertTrue(homePage.isRegisterButtonVisible());
    }

    @And("User checks sign in button visibility")
    public void userChecksSignInButtonVisibility() {
        assertTrue(homePage.isSignInButtonVisible());
    }

    @And("User checks ship to button visibility")
    public void userChecksShipToButtonVisibility() {
        assertTrue(homePage.isShipToButtonVisible());
    }

    @And("User checks shop by category button visibility")
    public void userChecksShopByCategoryButtonVisibility() {
        assertTrue(homePage.isShopByCategoryButtonVisible());
    }

    @And("User checks help and contact button visibility")
    public void userChecksHelpAndContactButtonVisibility() {
        assertTrue(homePage.isHelpAndContactButtonVisible());
    }

    @And("User checks watchlist button visibility")
    public void userChecksWatchlistButtonVisibility() {
        assertTrue(homePage.isWatchlistButtonVisible());
    }

    @And("User checks search button visibility")
    public void userChecksSearchButtonVisibility() {
       assertTrue(homePage.isSearchButtonVisible());
    }

    @When("User clicks Shop by category button")
    public void userClicksShopByCategoryButton() {
        homePage.clickOnShopByCategoryButton();
    }

    @And("User checks Shop by category popup visibility")
    public void userChecksShopByCategoryPopupVisibility() {
        assertTrue(homePage.isShopByCategoryPopupVisible());
    }

    @Then("User checks that see all categories button is visible")
    public void userChecksThatSeeAllCategoriesButtonIsVisible() {
        assertTrue(homePage.isSeeAllCategoriesButtonVisible());
    }
}
