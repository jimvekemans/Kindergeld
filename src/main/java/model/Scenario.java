package model;

import java.time.LocalDate;

/*
The Scenario class is a class with the variables for a single possible scenario.
This class is created to improve readability, performance and usability
A collection of Scenarios will be used for iteration through the possibilities
 */
public class Scenario {
    private static String targetWebSite = "http://vlaanderen.famifed.be/nl/calculator";
    private Beperkingen beperking;
    private BijslagtrekkendeSituaties bijslagtrekkendeSituatie;
    private LocalDate datum;
    private RechthebbendeSituaties rechthebbendeSituatie;
    private WeesBooleans weesBooleans;

    public Scenario(Datums datum, Beperkingen beperking, WeesBooleans weesBooleans, RechthebbendeSituaties rechthebbendeSituatie, BijslagtrekkendeSituaties bijslagtrekkendeSituatie) {
        this.datum = datum.getDate();
        this.beperking = beperking;
        this.weesBooleans = weesBooleans;
        this.rechthebbendeSituatie = rechthebbendeSituatie;
        this.bijslagtrekkendeSituatie = bijslagtrekkendeSituatie;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.toString();
    }

    public Beperkingen getBeperking() {
        return beperking;
    }

    public BijslagtrekkendeSituaties getBijslagtrekkendeSituatie() {
        return bijslagtrekkendeSituatie;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public RechthebbendeSituaties getRechthebbendeSituatie() {
        return rechthebbendeSituatie;
    }

    public WeesBooleans getWeesBooleans() {
        return weesBooleans;
    }
}
