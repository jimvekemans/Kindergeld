package model;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    private static ArrayList<Beperkingen> beperkingenArrayList = new ArrayList<>();
    private static ArrayList<Datums> datumsArrayList = new ArrayList<>();
    private static ArrayList<RechthebbendeSituaties> rechthebbendeSituatiesArrayList = new ArrayList<>();
    private static ArrayList<BijslagtrekkendeSituaties> bijslagtrekkendeSituatiesArrayList = new ArrayList<>();
    private static ArrayList<WeesBooleans> weesBooleansArrayList = new ArrayList<>();

    private static ArrayList<Scenario> scenarios = new ArrayList<>();
    private static CustomWriter customWriter;

    public static void main(String[] args) {
        fillEnumLists();
        generateScenarios();

        //als weeskind, geen situaties aanduiden want bedrag staat vast
        //als beperking, dan kan pas beperking worden geselecteerd
        HashMap<String, List<Scenario>> scenarioOptionsHashMap = new HashMap<>();
        scenarioOptionsHashMap.put("geenWeesGeenBeperking", scenarios.stream()
                .filter(s -> s.getBeperking() == Beperkingen.GEEN)
                .filter(s -> s.getWeesBooleans() == WeesBooleans.GEEN_WEES)
                .collect(Collectors.toList()));
        scenarioOptionsHashMap.put("geenWeesWelBeperking", scenarios.stream()
                .filter(s -> s.getWeesBooleans() == WeesBooleans.GEEN_WEES)
                .filter(s -> s.getBeperking() != Beperkingen.GEEN)
                .collect(Collectors.toList()));
        scenarioOptionsHashMap.put("geenBeperkingWelWees", scenarios.stream()
                .filter(s -> s.getBeperking() == Beperkingen.GEEN)
                .filter(s -> s.getWeesBooleans() != WeesBooleans.GEEN_WEES)
                .collect(Collectors.toList()));
        scenarioOptionsHashMap.put("welBeperkingWelWees", scenarios.stream()
                .filter(s -> s.getBeperking() != Beperkingen.GEEN)
                .filter(s -> s.getWeesBooleans() != WeesBooleans.GEEN_WEES)
                .collect(Collectors.toList()));

        // We loopen met een ForEach() door de hashmap
        // Key(String) en bijhorende Value(List<Scenario) worden telkens doorgegeven
        // We gebruiken de Key als featurenaam om de .feature file een naam te geven
        // We gebruiken de Values(scenarios) om de stappen in de .feature file uit te schrijven
        scenarioOptionsHashMap.forEach(
                (featureName, scenarios) -> {
                    FeatureFactory.useScenarios(scenarios);
                    try {
                        Path featureFilePath = Paths.get(featureName + ".feature");
                        customWriter = new CustomWriter(featureFilePath);
                        customWriter.writeAllToFile(FeatureFactory.generateFeature(featureName));
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    } finally {
                        customWriter.closeWriter();
                    }
                }
        );

    }

    private static void fillEnumLists() {
        beperkingenArrayList.addAll(Arrays.asList(Beperkingen.values()));
        datumsArrayList.addAll(Arrays.asList(Datums.values()));
        rechthebbendeSituatiesArrayList.addAll(Arrays.asList(RechthebbendeSituaties.values()));
        bijslagtrekkendeSituatiesArrayList.addAll(Arrays.asList(BijslagtrekkendeSituaties.values()));
        weesBooleansArrayList.addAll(Arrays.asList(WeesBooleans.values()));
    }

    private static void generateScenarios() {
        datumsArrayList.forEach(datum -> {
            beperkingenArrayList.forEach(beperking -> {
                weesBooleansArrayList.forEach(weesBooleans -> {
                    rechthebbendeSituatiesArrayList.forEach(rechthebbendeSituatie -> {
                        bijslagtrekkendeSituatiesArrayList.forEach(bijslagtrekkendeSituatie -> {
                            scenarios.add(new Scenario(datum, beperking, weesBooleans, rechthebbendeSituatie, bijslagtrekkendeSituatie));
                        });
                    });
                });
            });
        });
    }
}
