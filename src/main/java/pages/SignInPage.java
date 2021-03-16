package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id = 'userid']")
    private WebElement emailOrUsernameField;

    @FindBy(xpath = "//button[@id = 'signin-continue-btn']")
    private WebElement continueButton;

    @FindBy(xpath = "//button[@id = 'signin_fb_btn']")
    private WebElement continueWithFacebookButton;

    @FindBy(xpath = "//button[@id = 'signin_ggl_btn']")
    private WebElement continueWithGoogleButton;

    @FindBy(xpath = "//button[@id = 'signin_appl_btn']")
    private WebElement continueWithAppleButton;

    @FindBy(xpath = "//input[@id = 'kmsi-checkbox']")
    private WebElement staySignedInCheckbox;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public boolean isEmailOrUsernameFieldVisible() {
        return emailOrUsernameField.isDisplayed();
    }

    public boolean isContinueButtonVisible() {
        return continueButton.isDisplayed();
    }

    public boolean isContinueWithAppleButtonVisible() {
        return continueWithAppleButton.isDisplayed();
    }

    public boolean isContinueWithFacebookButtonVisible() {
        return continueWithFacebookButton.isDisplayed();
    }

    public boolean isContinueWithGoogleButtonVisible() {
        return continueWithGoogleButton.isDisplayed();
    }

    public boolean isStaySignedInCheckboxSelected() {
        return staySignedInCheckbox.isSelected();
    }
}
