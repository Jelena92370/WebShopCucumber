package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {



    public SelenideElement registerPageTitle = $(byTagName("h1"));
    public SelenideElement radioButtonFemale = $(byId("gender-female"));
    public SelenideElement firstNameField = $(byId("FirstName"));
    public SelenideElement lastNameField = $(byId("LastName"));
    public SelenideElement emailField = $(byId("Email"));
    public SelenideElement passwordField = $(byId("Password"));
    public SelenideElement confirmPasswordField = $(byId("ConfirmPassword"));



    public SelenideElement registerButton = $(byId("register-button"));
    //id=""

}
