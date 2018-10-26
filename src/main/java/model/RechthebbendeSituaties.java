package model;

public enum RechthebbendeSituaties {
    EERSTE("Werknemer / zelfstandige"),
    TWEEDE("Werknemer / zelfstandige met aanvullende werkloosheidsuitkering"),
    DERDE("Minder dan 6 maanden werkloos"),
    VIERDE("Langer dan 6 maanden werkloos / zelfstandige met faillisementsverzekering"),
    VIJFDE("Werkloze zonder uitkering, met recht op kinderbijslag"),
    ZESDE("Als werknemer / zelfstandige minder dan 6 maanden ziek"),
    ZEVENDE("Als werknemer / zelfstandige langer dan 6 maanden ziek of invalide"),
    ACHTSTE("Werknemer in loopbaanonderbreking"),
    NEGENDE("Gepensioneerd na langer dan 6 maanden ziek of invaliditeit"),
    TIENDE("Andere gepensioneerden"),
    ELFDE("Met leefloon (vroeger bestaansminimum)"),
    TWAALFDE("Student"),
    DERTIENDE("Gehandicapte met recht op kinderbijslag voor zichzelf"),
    VEERTIENDE("Gehandicapte met recht op kinderbijslag voor andere kinderen"),
    VIJFTIENDE("Rechthebbende overleden");

    private String situatieBeschrijving;

    RechthebbendeSituaties(String situatieBeschrijving) {
        this.situatieBeschrijving = situatieBeschrijving;
    }

    String getSituatieBeschrijving() {
        return situatieBeschrijving;
    }
}
