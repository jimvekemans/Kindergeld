Feature: CreateFirstChildFeature
  Interaction logic for creating the first child

  Scenario Outline: Creation again
    Given I go to website "http://vlaanderen.famifed.be/nl/calculator"
    And I click the button "Kind Toevoegen"
    When I enter the following for <name> and <date of birth>
    Then I try to do something else
    And get a certain <outcome>
    Examples:
      | name | date of birth | outcome |
      | Jim  | 11/10/1995    | 120     |
      | Lien | 28/04/2000    | 127     |
      | Nele | 23/05/1997    | 131     |
