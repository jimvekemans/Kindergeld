package model;

public enum BijslagtrekkendeSituaties {
    EERSTE("Alleen met de kinderen - bruto inkomsten per maand lager dan of gelijk aan € 2.452,41"),
    TWEEDE("Alleen met de kinderen - bruto inkomsten per maand hoger dan € 2.452,41"),
    DERDE("Samenwonend met de rechthebbende - bruto inkomsten per maand samen lager dan of gelijk aan € 2.531,55"),
    VIERDE("Samenwonend met de rechthebbende - bruto inkomsten per maand samen hoger dan € 2.531,55"),
    VIJFDE("Samenwonend met een andere persoon dan de rechthebbende"),
    ZESDE("Bijslagtrekkende is ook rechthebbende en woont samen met een andere persoon - bruto inkomsten per maand samen lager dan of gelijk aan € 2.531,55"),
    ZEVENDE("Bijslagtrekkende is ook rechthebbende en woont samen met een andere persoon - bruto inkomsten per maand samen hoger dan € 2.531,55"),
    ACHTSTE("Jongere die zelf zijn kinderbijslag ontvangt, buiten het gezin van de rechthebbende");

    private String situatieBeschrijving;

    BijslagtrekkendeSituaties(String situatieBeschrijving) {
        this.situatieBeschrijving = situatieBeschrijving;
    }

    String getSituatieBeschrijving() {
        return situatieBeschrijving;
    }
}
