package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ApparelAndShoesCategoryPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;

public class GridOrListSteps {

    ApparelAndShoesCategoryPage apparelAndShoesCategoryPage = new ApparelAndShoesCategoryPage();
    @When("^User clicks on view dropdown menu$")
    public void userClicksOnViewDropdownMenu() {
        apparelAndShoesCategoryPage.viewDropdownMenu.click();

    }

    @And("^chooses List view option$")
    public void choosesListViewOption() {
        apparelAndShoesCategoryPage.listView.click();
    }

    @Then("^List option is activated$")
    public void listOptionIsActivated() {
        apparelAndShoesCategoryPage.selectedOption.shouldHave(attribute("value", "https://demowebshop.tricentis.com/apparel-shoes?viewmode=list"));
    }

    @And("^chooses Grid view option$")
    public void choosesGridViewOption() {
        apparelAndShoesCategoryPage.gridView.click();
    }

    @Then("^Grid option is activated$")
    public void gridOptionIsActivated() {
        apparelAndShoesCategoryPage.selectedOption.shouldHave(attribute("value", "https://demowebshop.tricentis.com/apparel-shoes?viewmode=grid"));
    }

    @And("^All items are displayed as List$")
    public void allItemsAreDisplayedAsList() {
        apparelAndShoesCategoryPage.listClass.shouldBe(visible);

    }

    @Then("^All items are displayed as Grid$")
    public void allItemsAreDisplayedAsGrid() {
        apparelAndShoesCategoryPage.gridClass.shouldBe(visible);
    }
}

