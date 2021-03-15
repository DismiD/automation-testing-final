package manager;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterPage;
import pages.SearchResultsPage;
import pages.SignInPage;

public class PageFactoryManager {
    private WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }
    public RegisterPage getRegisterPage(){
        return new RegisterPage(driver);
    }
    public SignInPage getSignInPage(){
        return new SignInPage(driver);
    }
    public SearchResultsPage getSearchResultsPage(){
        return new SearchResultsPage(driver);
    }
}
