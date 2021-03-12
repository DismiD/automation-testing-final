package manager;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class PageFactoryManager {
    private WebDriver driver;

    public HomePage getHomePage(){
        return new HomePage(driver);
    }
}
