Feature: Community Poll Testing

Background:
Given User opens DemoWebshop page

  @VotingAsNotRegisteredUser
  Scenario: No possibility to vote as not registered user

    When User chooses answer Excellent for the Community poll question
    And clicks on Vote button
    Then the message "Only registered users can vote." appears
    When User chooses answer Good for the Community poll question
    And clicks on Vote button
    Then the message "Only registered users can vote." appears
    When User chooses answer Poor for the Community poll question
    And clicks on Vote button
    Then the message "Only registered users can vote." appears
    When User chooses answer Very bad for the Community poll question
    And clicks on Vote button
    Then the message "Only registered users can vote." appears

  @VotingAsRegisteredUser
  Scenario: Possibility to vote as registered user with option Excellent
    When User clicks on Register link
    Then User is on register page
    When User activates radiobutton Female for gender choice
    When User inputs random value in first name field
    And User inputs random value in last name field
    And random value in email field
    And random value in password field
    And repeats random password in confirm password field
    And clicks on Register button
    Then user is logged in as registered user
    When user pushes Continue button
    Then User opens DemoWebshop page
    When User chooses answer Excellent for the Community poll question
    And clicks on Vote button
    Then poll results are visible

  @NoVotingIfNoOptionIsChosen
  Scenario: No possibility to vote as registered user if no option is chosen
    When User clicks on Register link
    Then User is on register page
    When User activates radiobutton Female for gender choice
    When User inputs random value in first name field
    And User inputs random value in last name field
    And random value in email field
    And random value in password field
    And repeats random password in confirm password field
    And clicks on Register button
    Then user is logged in as registered user
    When user pushes Continue button
    Then User opens DemoWebshop page
    And clicks on Vote button
    Then Alert with the text "Please select an answer" appears

