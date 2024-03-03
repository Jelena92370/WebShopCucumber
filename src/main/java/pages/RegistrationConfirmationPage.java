package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationConfirmationPage {

    public SelenideElement accountName = $(byClassName("account"));
    public SelenideElement continueButton = $(byClassName("register-continue-button"));

}
