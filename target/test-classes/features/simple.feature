Feature: Shopping list

  Background: open application
    Given I check landing screen


  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen

  Scenario: Delete the shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen
    When I see new list "First List" on landing screen
    Then I click on a "First List"
    And  I click on the options button
    And I click the option Delete List
    And I click on button DELETE LIST
    Then I see the "First List" removed from from the landing screen
