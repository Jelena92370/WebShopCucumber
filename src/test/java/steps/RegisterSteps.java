package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import pages.RegisterPage;
import pages.RegistrationConfirmationPage;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage();
    @Then("^User is on register page$")
    public void userIsOnRegisterPage() {
registerPage.registerPageTitle.shouldHave(Condition.text("Register"));
    }

    @When("^User activates radiobutton Female for gender choice$")
    public void userActivatesRadiobuttonFemaleForGenderChoice() {
        registerPage.radioButtonFemale.click();
    }

    @When("^User inputs random value in first name field$")
    public void userInputsFirstNameInFirstNameField() {
        String firstNameValue = RandomStringUtils.randomAlphabetic(8);
        registerPage.firstNameField.setValue(firstNameValue);
    }

    @And("^User inputs random value in last name field$")
    public void userInputsRandomValueInLastNameField() {
        String lastNameValue = RandomStringUtils.randomAlphabetic(8);
        registerPage.lastNameField.setValue(lastNameValue);
    }

    private String emailValue;
    @And("^random value in email field$")
    public void randomValueInEmailField() {
        emailValue = "user" + RandomStringUtils.randomAlphabetic(5) + "@example.com";
        registerPage.emailField.setValue(emailValue);
    }
    public String getEmailValue() {
        return emailValue;
    }

    private String passwordValue;

    @And("^random value in password field$")
    public void randomValueInPasswordField() {
        passwordValue = RandomStringUtils.randomAlphabetic(8);
        registerPage.passwordField.setValue(passwordValue);
    }

    @And("^repeats random password in confirm password field$")
    public void repeatsRandomPasswordInConfirmPasswordField() {
        registerPage.confirmPasswordField.setValue(passwordValue);
    }

    @And("^clicks on Register button$")
    public void clicksOnRegisterButton() {
        registerPage.registerButton.click();
    }

    @Then("^user is logged in as registered user$")
    public void userIsLoggedInAsRegisteredUser() {
        registrationConfirmationPage.accountName.shouldHave(Condition.text(getEmailValue()));
    }

    @When("^user pushes Continue button$")
    public void userPushesContinueButton() {
        registrationConfirmationPage.continueButton.click();
    }
}
