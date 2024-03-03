package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DemoWebShopPage;

import static com.codeborne.selenide.Selenide.open;


public class DemoWebPageSteps {

    DemoWebShopPage demoWebShopPage = new DemoWebShopPage();

    @When("^User clicks on Apparel & Shoes category$")
    public void userClicksOnApparelShoesCategory() {
        demoWebShopPage.categoryLink.click();
    }

    @Given("^User opens DemoWebshop page$")
    public void userOpensDemoWebshopPage() {

        open("https://demowebshop.tricentis.com/");

        demoWebShopPage.welcomeText.shouldHave(Condition.text("Welcome to our store"));
    }

    @When("^User chooses answer Excellent for the Community poll question$")
    public void userChoosesAnswerExcellentForTheCommunityPollQuestion() {
        demoWebShopPage.exellentVoteOption.click();
    }

    @And("^clicks on Vote button$")
    public void clicksOnVoteButton() {
        demoWebShopPage.voteButton.click();
    }

    @Then("^the message \"([^\"]*)\" appears$")
    public void theMessageAppears(String messageText) {

        demoWebShopPage.voteErrorMessage.shouldHave(Condition.text(messageText));
    }

    @When("^User chooses answer Good for the Community poll question$")
    public void userChoosesAnswerGoodForTheCommunityPollQuestion() {
        demoWebShopPage.goodVoteOption.click();
    }

    @When("^User chooses answer Poor for the Community poll question$")
    public void userChoosesAnswerPoorForTheCommunityPollQuestion() {
        demoWebShopPage.poorVoteOption.click();
    }

    @When("^User chooses answer Very bad for the Community poll question$")
    public void userChoosesAnswerVeryBadForTheCommunityPollQuestion() {
        demoWebShopPage.veryBadVoteOption.click();
    }

    @When("^User clicks on Register link$")
    public void userClicksOnRegisterLink() {
        demoWebShopPage.registerLink.click();
    }

    @Then("^poll results are visible$")
    public void pollResultsAreVisible() {
        demoWebShopPage.pollResults.shouldBe(Condition.visible);
    }

    @Then("^Alert with the text \"([^\"]*)\" appears$")
    public void alertWithTheTextAppears(String expectedAlertText) {

        Selenide.switchTo().alert().getText().contains(expectedAlertText);
    }
}
