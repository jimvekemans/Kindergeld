package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    private static ArrayList<Beperkingen> beperkingenArrayList = new ArrayList<>();
    private static ArrayList<Datums> datumsArrayList = new ArrayList<>();
    private static ArrayList<RechthebbendeSituaties> rechthebbendeSituatiesArrayList = new ArrayList<>();
    private static ArrayList<BijslagtrekkendeSituaties> bijslagtrekkendeSituatiesArrayList = new ArrayList<>();
    private static ArrayList<WeesBooleans> weesBooleansArrayList = new ArrayList<>();
    private static StreamWriter streamWriter;

    public static void main(String[] args) {
        try {
            Path temp = Files.createFile(Paths.get("C\\Users\\jimve\\Documents\\TestCases.csv"));
            //streamWriter = new StreamWriter("C\\Users\\jimve\\Documents\\TestCases.csv");
        } catch (IOException ioe) {
            System.out.println("Failed to create streamwriter");
            ioe.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
        fillArrayLists();
        /*
        datumsArrayList.forEach(datum -> {
            beperkingenArrayList.forEach(beperking -> {
                weesBooleansArrayList.forEach(weesBooleans -> {
                    rechthebbendeSituatiesArrayList.forEach(rechthebbendeSituatie -> {
                        bijslagtrekkendeSituatiesArrayList.forEach(bijslagtrekkendeSituatie -> {
                            streamWriter.writeToFile(
                                    "Voornaam_Achternaam: "
                                            + "Datum: " + datum + "; "
                                            + "Beperking: " + beperking + "; "
                                            + "Wees: " + weesBooleans.getBooleanWaardes() + "; "
                                            + "Situatie rechthebbende: " + rechthebbendeSituatie + "; "
                                            + "Situatie bijslagtrekkende:" + bijslagtrekkendeSituatie
                            );
                        });
                    });
                });
            });
        });
        */
    }

    private static void fillArrayLists() {
        beperkingenArrayList.addAll(Arrays.asList(Beperkingen.values()));
        datumsArrayList.addAll(Arrays.asList(Datums.values()));
        rechthebbendeSituatiesArrayList.addAll(Arrays.asList(RechthebbendeSituaties.values()));
        bijslagtrekkendeSituatiesArrayList.addAll(Arrays.asList(BijslagtrekkendeSituaties.values()));
        weesBooleansArrayList.addAll(Arrays.asList(WeesBooleans.values()));
    }
}
