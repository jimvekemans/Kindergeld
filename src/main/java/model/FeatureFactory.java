package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FeatureFactory {
    static Collection<Scenario> scenariosCollection;

    private static List<String> generateFeatureHeading(String featureName) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Feature: " + featureName);
        stringList.add("\tThis feature was auto-generated, please replace this line with a description\r\n");
        stringList.add("\tScenario Outline: " + featureName);
        return stringList;
    }

    private static List<String> generateFeatureSteps() {
        if (scenariosCollection == null) throw new NullPointerException("Declare scenarios first");
        List<String> stepList = new ArrayList<>();
        //TODO complete writing steps based on the scenarios:
        //if(beperking){beperking selecteren}
        //if(!wees){rechtshebbendesituatie bepalen + bijslagtrekkendesituatie bepalen}
        return stepList;
    }

    private static List<String> generateFeatureExamples() {
        if (scenariosCollection == null) throw new NullPointerException("Declare scenarios first");
        List<String> exampleList = new ArrayList<>();
        //TODO fill exampleList based on input
        return exampleList;
    }

    public static List<String> generateFeature(String featureName) {
        if (scenariosCollection == null) throw new NullPointerException("Declare scenarios first");
        List<String> featureLines = new ArrayList<>();
        featureLines.addAll(generateFeatureHeading(featureName));
        featureLines.addAll(generateFeatureSteps());
        featureLines.addAll(generateFeatureExamples());
        return featureLines;
    }

    public static void useScenarios(Collection<Scenario> scenarios) {
        scenariosCollection = scenarios;
    }
}
