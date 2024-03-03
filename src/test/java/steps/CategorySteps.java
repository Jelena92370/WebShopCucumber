package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ApparelAndShoesCategoryPage;

public class CategorySteps {
    ApparelAndShoesCategoryPage apparelAndShoesCategoryPage = new ApparelAndShoesCategoryPage();

    @Then("^User is on Apparel & Shoes category page$")
    public void userIsOnApparelShoesCategoryPage() {
        apparelAndShoesCategoryPage.categoryTitle.shouldHave(Condition.text("Apparel & Shoes"));
    }

    @When("^User clicks on display dropdownmenu$")
    public void userClicksOnDisplayDropdownmenu() {
        apparelAndShoesCategoryPage.dropdownMenu.click();
    }

    @And("^chooses option to display (\\d+) items$")
    public void choosesOptionToDisplayItems(int numberOfItems) {
        switch (numberOfItems) {
            case 4:
                apparelAndShoesCategoryPage.optionFourElements.click();
                break;
            case 8:
                apparelAndShoesCategoryPage.optionEightElements.click();
                break;
            case 12:
                apparelAndShoesCategoryPage.optionTwelveElements.click();
                break;
            default:
                break;
    }
    }


    @Then("^(\\d+) items are displayed on the page$")
    public void itemsAreDisplayedOnThePage(int numberOfItems) {
        apparelAndShoesCategoryPage.itemBoxes.shouldHave(CollectionCondition.size(numberOfItems));
    }

    @And("^every item has a name$")
    public void everyItemHasAName() {
        apparelAndShoesCategoryPage.productTitles.filterBy(Condition.visible)
                .shouldHave(CollectionCondition.size(apparelAndShoesCategoryPage.itemBoxes.size()));
            }

    @And("^every item has a photo$")
    public void everyItemHasAPhoto() {
        apparelAndShoesCategoryPage.productPictures.filterBy(Condition.visible)
                .shouldHave(CollectionCondition.size(apparelAndShoesCategoryPage.itemBoxes.size()));
    }

    @And("^every item has a cart button$")
    public void everyItemHasACartButton() {
        apparelAndShoesCategoryPage.addButtons.filterBy(Condition.visible)
                .shouldHave(CollectionCondition.size(apparelAndShoesCategoryPage.itemBoxes.size()));
    }

    @And("^every item has a rating in stars$")
    public void everyItemHasARatingInStars() {
        apparelAndShoesCategoryPage.ratingStars.filterBy(Condition.visible)
                .shouldHave(CollectionCondition.size(apparelAndShoesCategoryPage.itemBoxes.size()));
    }
}



