Feature: CreateFirstChildFeature
  Interaction logic for creating the first child

  Scenario Outline: CreateFirstChild
    Given I go to website "http://vlaanderen.famifed.be/nl/calculator"
    Then click the button to begin the calculation
    When I enter the following for name:<naamVanKind> and day of birth:<geboorteDatum>
    And the child has a limitation
    And I select the following limitation:<beperking>
    And select that the child is not an orphan
    And I click the ToeVoeg-button
    And I wait for <250> milliseconds
    Then I select the following for BijslagTrekkende:<bijslag> and Rechthebbende:<rechtheb>
    And I wait for <2000> milliseconds

    Examples:
      | naamVanKind | geboorteDatum | bijslag | rechtheb | beperking |
      | Timmy       | 12/12/2012    | 1       | 1        | hjfsdf    |
