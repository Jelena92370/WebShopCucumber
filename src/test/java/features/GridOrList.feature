Feature: Grid or List view for Apparel And Shoes

  Background:
    Given User opens DemoWebshop page

  @ListView
  Scenario: Items well displayed by List view

    When User clicks on Apparel & Shoes category
    Then User is on Apparel & Shoes category page
    When User clicks on view dropdown menu
    And chooses List view option
    Then List option is activated
    And All items are displayed as List
    And every item has a name
    And every item has a photo
    And every item has a cart button
    And every item has a rating in stars


  @GridView
  Scenario: Items well displayed by Grid view

    When User clicks on Apparel & Shoes category
    Then User is on Apparel & Shoes category page
    When User clicks on view dropdown menu
    And chooses Grid view option
    Then Grid option is activated
    Then All items are displayed as Grid
    And every item has a name
    And every item has a photo
    And every item has a cart button
    And every item has a rating in stars