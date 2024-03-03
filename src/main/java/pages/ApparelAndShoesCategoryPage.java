package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ApparelAndShoesCategoryPage {

    public SelenideElement categoryTitle = $(byTagName("h1"));
    public SelenideElement dropdownMenu = $(byId("products-pagesize"));

    public SelenideElement optionFourElements = $(byValue("https://demowebshop.tricentis.com/apparel-shoes?pagesize=4"));

    public SelenideElement optionEightElements = $(byValue("https://demowebshop.tricentis.com/apparel-shoes?pagesize=8"));

    public SelenideElement optionTwelveElements = $(byValue("https://demowebshop.tricentis.com/apparel-shoes?pagesize=12"));

    public ElementsCollection itemBoxes = $$(byClassName("item-box"));

    public ElementsCollection productTitles = $$(".product-title");

    public ElementsCollection productPictures = $$(byTagName("img")).filterBy(Condition.not(Condition.attribute("alt", "Tricentis Demo Web Shop")));


    public ElementsCollection addButtons = $$(byClassName("product-box-add-to-cart-button"));

    public ElementsCollection ratingStars = $$(byClassName("rating"));

    public SelenideElement viewDropdownMenu = $(byId("products-viewmode"));

    public SelenideElement listView = $(byText("List"));

    public SelenideElement gridView = $(byText("Grid"));
    public SelenideElement selectedOption = $("option[selected=\"selected\"]");

    public SelenideElement listClass = $(byClassName("product-list"));
    public SelenideElement gridClass = $(byClassName("product-grid"));

}
