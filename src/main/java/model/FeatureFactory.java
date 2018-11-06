package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FeatureFactory {
    private static Collection<Scenario> scenariosCollection;

    public static void useScenarios(Collection<Scenario> scenarios) {
        scenariosCollection = scenarios;
    }

    private static List<String> generateFeatureHeading(String featureName) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Feature: " + featureName);
        stringList.add("\tThis feature was auto-generated, please replace this line with a description\r\n");
        stringList.add("\tScenario Outline: " + featureName);
        stringList.add("\t\tGiven I go to website \"http://vlaanderen.famifed.be/nl/calculator\"");
        stringList.add("\t\tThen click the button to begin the calculation");
        stringList.add("\t\tWhen I enter the following for name:<naamVanKind> and day of birth:<geboorteDatum>");
        return stringList;
    }

    private static List<String> generateFeatureSteps(String featureName) {
        if (scenariosCollection == null) throw new NullPointerException("Declare scenarios first");
        List<String> stepList = new ArrayList<>();
        switch (featureName) {
            case "geenWeesGeenBeperking":
                stepList.add("\t\tAnd the child has no limitations");
                stepList.add("\t\tAnd select that the child is not an orphan");
                stepList.add("\t\tAnd I click the ToeVoeg-button");
                stepList.add("\t\tAnd I wait for <250> milliseconds");
                stepList.add("\t\tThen I select the following for BijslagTrekkende:<BijslagTrekkendeSituatie> and Rechthebbende:<RechtHebbendeSituatie>");
                break;
            case "geenWeesWelBeperking":
                stepList.add("\t\tAnd the child has a limitation");
                stepList.add("\t\tAnd select that the child is not an orphan");
                stepList.add("\t\tAnd I click the ToeVoeg-button");
                stepList.add("\t\tAnd I wait for <250> milliseconds");
                stepList.add("\t\tThen I select the following for BijslagTrekkende:<BijslagTrekkendeSituatie> and Rechthebbende:<RechtHebbendeSituatie>");
                break;
            case "geenBeperkingWelWees":
                stepList.add("\t\tAnd the child has no limitations");
                stepList.add("\t\tAnd select that the child is an orphan");
                stepList.add("\t\tAnd I click the ToeVoeg-button");
                stepList.add("\t\tAnd I wait for <250> milliseconds");
                break;
            case "welBeperkingWelWees":
                stepList.add("\t\tAnd the child has a limitation");
                stepList.add("\t\tAnd I select the following limitation:<Beperking>");
                stepList.add("\t\tAnd select that the child is an orphan");
                stepList.add("\t\tAnd I click the ToeVoeg-button");
                stepList.add("\t\tAnd I wait for <250> milliseconds");
                break;
        }
        stepList.add("\r\n");
        stepList.add("\t\tExamples:");
        return stepList;
    }

    private static List<String> generateExamplesFromScenarios(String featureName) {
        List<String> examplesList = new ArrayList<>();
        switch (featureName) {
            case "geenWeesGeenBeperking":
                examplesList.add("\t\t|naamVanKind|geboorteDatum|BijslagTrekkendeSituatie|RechtHebbendeSituatie|");
                examplesList.addAll(scenariosCollection.stream()
                        .map(scenario -> {
                            LocalDate birthDay = scenario.getDatum();
                            StringBuilder sb = new StringBuilder("\t\t|TestKindje|");
                            sb.append(String.format("%2s", birthDay.getDayOfMonth() + "/"));
                            sb.append(String.format("%2s", birthDay.getMonthValue() + "/"));
                            sb.append(birthDay.getYear() + "|");
                            sb.append(scenario.getBijslagtrekkendeSituatie().getSituatieBeschrijving() + "|");
                            sb.append(scenario.getRechthebbendeSituatie().getSituatieBeschrijving() + "|");
                            return sb.toString();
                        })
                        .collect(Collectors.toList()));
                break;
            case "geenWeesWelBeperking":
                examplesList.add("\t\t|naamVanKind|geboorteDatum|Beperking|BijslagTrekkendeSituatie|RechtHebbendeSituatie|");
                examplesList.addAll(scenariosCollection.stream()
                        .map(scenario -> {
                            LocalDate birthDay = scenario.getDatum();
                            StringBuilder sb = new StringBuilder("\t\t|TestKindje|");
                            sb.append(String.format("%2s", birthDay.getDayOfMonth() + "/"));
                            sb.append(String.format("%2s", birthDay.getMonthValue() + "/"));
                            sb.append(birthDay.getYear() + "|");
                            sb.append(scenario.getBeperking().getBeperkingBeschrijving() + "|");
                            sb.append(scenario.getBijslagtrekkendeSituatie().getSituatieBeschrijving() + "|");
                            sb.append(scenario.getRechthebbendeSituatie().getSituatieBeschrijving() + "|");
                            return sb.toString();
                        })
                        .collect(Collectors.toList()));
                break;
            case "geenBeperkingWelWees":
                examplesList.add("\t\t|naamVanKind|geboorteDatum|BijslagTrekkendeSituatie|RechtHebbendeSituatie|beperking|");
                /*
                examplesList.addAll(scenariosCollection.stream()
                        .map(scenario -> {
                            LocalDate birthDay = scenario.getDatum();
                            StringBuilder sb = new StringBuilder("\t\t|TestKindje|");
                            sb.append(String.format("%2s",birthDay.getDayOfMonth()+"/"));
                            sb.append(String.format("%2s",birthDay.getMonthValue()+"/"));
                            sb.append(birthDay.getYear()+"|");
                            sb.append(scenario.getBijslagtrekkendeSituatie().getSituatieBeschrijving()+"|");
                            sb.append(scenario.getRechthebbendeSituatie().getSituatieBeschrijving()+"|");
                            return sb.toString();
                        })
                        .collect(Collectors.toList()));
                */
                break;
            case "welBeperkingWelWees":
                examplesList.add("\t\t|naamVanKind|geboorteDatum|Beperking|BijslagTrekkendeSituatie|RechtHebbendeSituatie|");
                /*
                examplesList.addAll(scenariosCollection.stream()
                        .map(scenario -> {
                            LocalDate birthDay = scenario.getDatum();
                            StringBuilder sb = new StringBuilder("\t\t|TestKindje|");
                            sb.append(String.format("%2s",birthDay.getDayOfMonth()+"/"));
                            sb.append(String.format("%2s",birthDay.getMonthValue()+"/"));
                            sb.append(birthDay.getYear()+"|");
                            sb.append(scenario.getBijslagtrekkendeSituatie().getSituatieBeschrijving()+"|");
                            sb.append(scenario.getRechthebbendeSituatie().getSituatieBeschrijving()+"|");
                            return sb.toString();
                        })
                        .collect(Collectors.toList()));
                */
                break;
        }
        return examplesList;
    }

    public static List<String> generateFeature(String featureName) {
        if (scenariosCollection == null) throw new NullPointerException("Declare scenarios first");
        List<String> featureLines = new ArrayList<>();
        featureLines.addAll(generateFeatureHeading(featureName));
        featureLines.addAll(generateFeatureSteps(featureName));
        featureLines.addAll(generateExamplesFromScenarios(featureName));
        return featureLines;
    }
}
