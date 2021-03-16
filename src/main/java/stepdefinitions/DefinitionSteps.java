package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.RegisterPage;
import pages.SearchResultsPage;
import pages.SignInPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    private WebDriver driver;
    private PageFactoryManager pageFactoryManager;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private RegisterPage registerPage;
    private SignInPage signInPage;


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

    @When("User clicks register button")
    public void userClicksRegisterButton() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickOnRegisterButton();
    }

    @And("User checks first name field visibility")
    public void userChecksFirstNameFieldVisibility() {
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(registerPage.isFirstNameFieldVisible());
    }

    @And("User checks last name field visibility")
    public void userChecksLastNameFieldVisibility() {
        assertTrue(registerPage.isLastNameFieldVisible());
    }

    @And("User checks email field visibility")
    public void userChecksEmailFieldVisibility() {
        assertTrue(registerPage.isEmailFieldVisible());
    }

    @And("User checks password field visibility")
    public void userChecksPasswordFieldVisibility() {
        assertTrue(registerPage.isPasswordFieldVisible());
    }

    @And("User checks Create account button visibility")
    public void userChecksCreateAccountButtonVisibility() {
        assertTrue(registerPage.isCreateAccountButtonVisible());
    }

    @And("User checks Create account button is disabled")
    public void userChecksCreateAccountButtonIsDisabled() {
        assertFalse(registerPage.isCreateAccountButtonEnabled());
    }

    @And("User checks Continue with Google  button visibility")
    public void userChecksContinueWithGoogleButtonVisibility() {
        assertTrue(registerPage.isContinueWithGoogleButtonVisible());
    }

    @And("User checks Continue with Facebook  button visibility")
    public void userChecksContinueWithFacebookButtonVisibility() {
        assertTrue(registerPage.isContinueWithFacebookButtonVisible());
    }

    @And("User checks Continue with Apple  button visibility")
    public void userChecksContinueWithAppleButtonVisibility() {
        assertTrue(registerPage.isContinueWithAppleButtonVisible());
    }

    @And("User enters first name {string}")
    public void userEntersFirstNameFirstName(final String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @And("User enters last name {string}")
    public void userEntersLastNameLastName(final String lastName) {
        registerPage.enterLastName(lastName);
    }

    @And("User enters email {string}")
    public void userEntersEmailEmail(final String email) {
        registerPage.enterEmail(email);
    }

    @And("User enters password {string}")
    public void userEntersPasswordPassword(final String password) {
        registerPage.enterPassword(password);
    }

    @Then("User checks if Create account button is enabled")
    public void userChecksIfCreateAccountButtonIsEnabled() {
        registerPage.waitForElementToBeClickable(DEFAULT_TIMEOUT ,registerPage.getCreateAccountButton());
        assertTrue(registerPage.isCreateAccountButtonEnabled());
    }

    @When("User clicks Sign in button")
    public void userClicksSignInButton() {
        homePage.clickOnSignInButton();
    }


    @And("User checks email or username field visibility")
    public void userChecksEmailOrUsernameFieldVisibility() {
      signInPage = pageFactoryManager.getSignInPage();
      signInPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
      assertTrue(signInPage.isEmailOrUsernameFieldVisible());
    }

    @And("User checks Continue button visibility")
    public void userChecksContinueButtonVisibility() {
        signInPage.waitForElementToBeClickable(DEFAULT_TIMEOUT,signInPage.getContinueButton());
        assertTrue(signInPage.isContinueButtonVisible());
    }

    @And("User checks Continue with Apple button visibility")
    public void userChecksContinueWithAppleButtonVisibilityOnSignInPage() {
        assertTrue(signInPage.isContinueWithAppleButtonVisible());
    }

    @And("User checks Continue with Google button visibility")
    public void userChecksContinueWithGoogleButtonVisibilityOnSignInPage() {
        assertTrue(signInPage.isContinueWithGoogleButtonVisible());
    }

    @And("User checks Continue with Facebook button visibility")
    public void userChecksContinueWithFacebookButtonVisibilityOnSignInPage() {
        assertTrue(signInPage.isContinueWithFacebookButtonVisible());
    }

    @Then("User checks that stay signed in checkbox is selected")
    public void userChecksThatStaySignedInCheckboxIsSelected() {
        assertTrue(signInPage.isStaySignedInCheckboxSelected());
    }
}
