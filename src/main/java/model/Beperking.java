package model;

public enum Beperking {
    FIRST("minder dan 6 punten en een minimum van 4 punten in P1"),
    SECOND("6 tot 8 punten en minder dan 4 punten in P1"),
    THIRD("6 tot 8 punten en een minimum van 4 punten in P1"),
    FOURTH("9 tot 11 punten en minder dan 4 punten in P1"),
    FIFTH("9 tot 11 punten en een minimum van 4 punten in P1"),
    SIXTH("12 tot 14 punten"),
    SEVENTH("15 tot 17 punten"),
    EIGHTH("18 tot 20 punten"),
    NINETH("meer dan 20 punten");

    private final String beperkingBeschrijving;

    Beperking(String beperkingBeschrijving) {
        this.beperkingBeschrijving = beperkingBeschrijving;
    }

    public String getBeperkingBeschrijving() {
        return beperkingBeschrijving;
    }
}
