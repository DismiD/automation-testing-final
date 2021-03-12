package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//header[@id='gh']")
    private WebElement header;

    @FindBy(xpath = "//footer[@id ='glbfooter']")
    private WebElement footer;

    @FindBy(xpath = "/span[@id='gh-ug']//a[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@id='gh-ug']//a[text()='register']")
    private WebElement registerButton;

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    private WebElement shopByCategoryButton;

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='gh-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@class='gh-eb-li-a']")
    private WebElement cartIcon;

    @FindBy(xpath = "//button[@class='gh-control ghn-b gh-eb-li-a']")
    private WebElement notificationButton;

    @FindBy(xpath = "//button[@class='gh-eb-li-a gh-icon']")
    private WebElement shipToButton;

    @FindBy(xpath = "//a[text()=' Help & Contact']")
    private WebElement helpAndContactButton;

    @FindBy(xpath = "//a[@title='Watchlist']")
    private WebElement watchlistButton;

   public boolean isHeaderVisible(){
       return header.isDisplayed();
   }

    public boolean isFooterVisible(){
        return footer.isDisplayed();
    }

    public boolean isSignInButtonVisible(){
        return signInButton.isDisplayed();
    }

    public boolean isRegisterButtonVisible(){
        return registerButton.isDisplayed();
    }

    public boolean isShopByCategoryButtonVisible(){
        return shopByCategoryButton.isDisplayed();
    }

    public boolean isSearchFieldVisible(){
        return searchField.isDisplayed();
    }


    public boolean isSearchButtonVisible(){
        return searchButton.isDisplayed();
    }

    public boolean isCartIconVisible(){
        return cartIcon.isDisplayed();
    }

    public boolean isNotificationButtonVisible(){
        return notificationButton.isDisplayed();
    }

    public boolean isShipToButtonVisible(){
        return shipToButton.isDisplayed();
    }

    public boolean isHelpAndContactButtonVisible(){
        return helpAndContactButton.isDisplayed();
    }
}
