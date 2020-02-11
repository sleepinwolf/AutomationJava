Feature: Shopping list

  Background: open application
    Given I check landing screen


  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen

  Scenario: Delete shopping list
    When I click on a shopping list
    And  I click on the options button
    And I click the option "Delete List"
    And I click on button "DELETE LIST"
    Then I see the "shopping list" removed from from the landing screen
