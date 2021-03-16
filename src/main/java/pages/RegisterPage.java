package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id = 'firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id = 'lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id = 'Email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id = 'EMAIL_REG_FORM_SUBMIT']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//button[@id = 'google']")
    private WebElement continueWithGoogleButton;

    @FindBy(xpath = "//button[@id = 'apple']")
    private WebElement continueWithAppleButton;

    @FindBy(xpath = "//button[@id = 'facebook']")
    private WebElement continueWithFacebookButton;

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public boolean isFirstNameFieldVisible (){
      return   firstNameField.isDisplayed();
    }
    public boolean isLastNameFieldVisible (){
        return   lastNameField.isDisplayed();
    }
    public boolean isEmailFieldVisible (){
        return   emailField.isDisplayed();
    }
    public boolean isPasswordFieldVisible (){
        return   passwordField.isDisplayed();
    }
    public boolean isCreateAccountButtonVisible (){
        return   createAccountButton.isDisplayed();
    }
    public boolean isCreateAccountButtonEnabled (){
        return   createAccountButton.isEnabled();
    }
    public boolean isContinueWithAppleButtonVisible (){
        return   continueWithAppleButton.isDisplayed();
    }
    public boolean isContinueWithFacebookButtonVisible (){
        return   continueWithFacebookButton.isDisplayed();
    }
    public boolean isContinueWithGoogleButtonVisible (){
        return   continueWithGoogleButton.isDisplayed();
    }
    public void enterFirstName(final String firstName){
        firstNameField.sendKeys(firstName);
    }
    public void enterLastName(final String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void enterEmail(final String email){
        emailField.sendKeys(email);
    }
    public void enterPassword(final String password){
        passwordField.sendKeys(password);
    }
}
