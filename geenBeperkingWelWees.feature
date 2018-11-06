Feature: geenBeperkingWelWees
  This feature was auto-generated, please replace this line with a description

  Scenario Outline: geenBeperkingWelWees
    Given I go to website "http://vlaanderen.famifed.be/nl/calculator"
    Then click the button to begin the calculation
    When I enter the following for name:<naamVanKind> and day of birth:<geboorteDatum>
    And the child has no limitations
    And select that the child is an orphan
    And I click the ToeVoeg-button
    And I wait for <250> milliseconds


    Examples:
      | naamVanKind | geboorteDatum | BijslagTrekkendeSituatie | RechtHebbendeSituatie | beperking |
