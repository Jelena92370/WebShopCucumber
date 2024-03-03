Feature: Apparel And Shoes

  Background:
    Given User opens DemoWebshop page

  @fourItems
  Scenario: Successful choice of 4 items

    When User clicks on Apparel & Shoes category
    Then User is on Apparel & Shoes category page
    When User clicks on display dropdownmenu
    And chooses option to display 4 items
    Then 4 items are displayed on the page
    And every item has a name
    And every item has a photo
    And every item has a cart button
    And every item has a rating in stars

  @eightItems
  Scenario: Successful choice of 8 items

    When User clicks on Apparel & Shoes category
    Then User is on Apparel & Shoes category page
    When User clicks on display dropdownmenu
    And chooses option to display 8 items
    Then 8 items are displayed on the page
    And every item has a name
    And every item has a photo
    And every item has a cart button
    And every item has a rating in stars

  @twelveItems
  Scenario: Successful choice of 12 items

    When User clicks on Apparel & Shoes category
    Then User is on Apparel & Shoes category page
    When User clicks on display dropdownmenu
    And chooses option to display 12 items
    Then 12 items are displayed on the page
    And every item has a name
    And every item has a photo
    And every item has a cart button
    And every item has a rating in stars



