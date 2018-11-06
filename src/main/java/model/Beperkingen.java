package model;

public enum Beperkingen {
    GEEN("geen beperking"),
    EERSTE("minder dan 6 punten en een minimum van 4 punten in P1"),
    TWEEDE("6 tot 8 punten en minder dan 4 punten in P1"),
    DERDE("6 tot 8 punten en een minimum van 4 punten in P1"),
    VIERDE("9 tot 11 punten en minder dan 4 punten in P1"),
    VIJFDE("9 tot 11 punten en een minimum van 4 punten in P1"),
    ZESDE("12 tot 14 punten"),
    ZEVENDE("15 tot 17 punten"),
    ACHTSTE("18 tot 20 punten"),
    NEGENDE("meer dan 20 punten");

    private final String beperkingBeschrijving;

    Beperkingen(String beperkingBeschrijving) {
        this.beperkingBeschrijving = beperkingBeschrijving;
    }

    public String getBeperkingBeschrijving() {
        return beperkingBeschrijving;
    }
}
