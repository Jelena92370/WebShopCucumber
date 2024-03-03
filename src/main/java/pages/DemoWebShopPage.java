package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DemoWebShopPage {

    public SelenideElement welcomeText = $(byClassName("topic-html-content-header"));
    public SelenideElement categoryLink = $(byText("Apparel & Shoes"));

    public SelenideElement exellentVoteOption = $(byId("pollanswers-1"));

    public SelenideElement voteButton = $(byId("vote-poll-1"));

    public SelenideElement voteErrorMessage = $(byId("block-poll-vote-error-1"));

    //
    public SelenideElement goodVoteOption = $(byId("pollanswers-2"));

    public SelenideElement poorVoteOption = $(byId("pollanswers-3"));
    public SelenideElement veryBadVoteOption = $(byId("pollanswers-4"));

    public SelenideElement registerLink = $(byClassName("ico-register"));
    public SelenideElement pollResults = $(byClassName("poll-results"));
    //
}
