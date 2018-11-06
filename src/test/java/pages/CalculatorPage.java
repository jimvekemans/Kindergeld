package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class CalculatorPage extends AbstractPage {

    @FindBy(css = "a.fieldset-title.ariaToggle-processed")
    private static WebElement beginButton;
    @FindBy(id = "edit-first-name")
    private static WebElement naamVanKindVeld;
    @FindBy(id = "edit-date-of-birth-datepicker-popup-0")
    private static WebElement datumVeld;
    @FindBy(id = "edit-add-button")
    private static WebElement addChildButton;
    @FindBy(id = "edit-disabled-1")
    private static WebElement beperkingTrueButton;
    @FindBy(id = "edit-disabled-0")
    private static WebElement beperkingFalseButton;
    @FindBy(id = "edit-orphan-1")
    private static WebElement weesTrueButton;
    @FindBy(id = "edit-orphan-0")
    private static WebElement weesFalseButton;
    @FindBy(id = "edit-orphan-parent-alive-1")
    private static WebElement weesOuderInLevenTrue;
    @FindBy(id = "edit-orphan-parent-alive-0")
    private static WebElement weesOuderInLevenFalse;
    @FindBy(id = "edit-orphan-surviving-parent-remarried-1")
    private static WebElement weesOuderHertrouwdTrue;
    @FindBy(id = "edit-orphan-surviving-parent-remarried-0")
    private static WebElement weesOuderHertrouwdFalse;
    @FindBy(id = "edit-orphan-abadonned-1")
    private static WebElement weesVerlatenTrue;
    @FindBy(id = "edit-orphan-abandonned-0")
    private static WebElement weesVerlatenFalse;
    @FindBy(css = "a.use-ajax.link.link-claimant.to-be-defined.ajax-processed")
    private static WebElement selectRechtHebbendLink;
    @FindBy(css = "a.use-ajax.link.link-receiver.to-be-defined.ajax-processed")
    private static WebElement selectBijslagTrekLink;
    @FindBy(id = "edit-disabled-option-new-109-1")
    private static WebElement eersteBeperking;
    @FindBy(id = "edit-disabled-option-new-110-1")
    private static WebElement tweedeBeperking;
    @FindBy(id = "edit-disabled-option-new-113-1")
    private static WebElement derdeBeperking;
    @FindBy(id = "edit-disabled-option-new-112-1")
    private static WebElement vierdeBeperking;
    @FindBy(id = "edit-disabled-option-new-113-2")
    private static WebElement vijfdeBeperking;
    @FindBy(id = "edit-disabled-option-new-113-3")
    private static WebElement zesdeBeperking;
    @FindBy(id = "edit-disabled-option-new-105-1")
    private static WebElement zevendeBeperking;
    @FindBy(id = "edit-disabled-option-new-106-1")
    private static WebElement achtsteBeperking;
    @FindBy(id = "edit-disabled-option-new-107-1")
    private static WebElement negendeBeperking;
    private static HashMap<String, WebElement> beperkingWebElementMap = new HashMap<>();
    @FindBy(id = "edit-claimant-16")
    private static WebElement eersteRechtHebSituatie;
    @FindBy(id = "edit-claimant-17")
    private static WebElement tweedeRechtHebSituatie;
    @FindBy(id = "edit-claimant-18")
    private static WebElement derdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-22")
    private static WebElement vierdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-23")
    private static WebElement vijfdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-24")
    private static WebElement zesdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-25")
    private static WebElement zevendeRechtHebSituatie;
    @FindBy(id = "edit-claimant-26")
    private static WebElement achtsteRechtHebSituatie;
    @FindBy(id = "edit-claimant-27")
    private static WebElement negendeRechtHebSituatie;
    @FindBy(id = "edit-claimant-28")
    private static WebElement tiendeRechtHebSituatie;
    @FindBy(id = "edit-claimant-29")
    private static WebElement elfdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-30")
    private static WebElement twaalfdeRechtHebSituatie;
    @FindBy(id = "edit-claimant-31")
    private static WebElement dertiendeRechtHebSituatie;
    @FindBy(id = "edit-claimant-32")
    private static WebElement veertiendeRechtHebSituatie;
    @FindBy(id = "edit-claimant-33")
    private static WebElement vijftiendeRechtHebSituatie;
    private static HashMap<String, WebElement> rechtHebSitWebMap = new HashMap<>();
    @FindBy(id = "edit-receiver-19")
    private static WebElement eersteBijslagTrekSit;
    @FindBy(id = "edit-receiver-405")
    private static WebElement tweedeBijslagTrekSit;
    @FindBy(id = "edit-receiver-21")
    private static WebElement derdeBijslagTrekSit;
    @FindBy(id = "edit-receiver-406")
    private static WebElement vierdeBijslagTrekSit;
    @FindBy(id = "edit-receiver-20")
    private static WebElement vijfdeBijslagTrekSit;
    @FindBy(id = "edit-receiver-407")
    private static WebElement zesdeBijslagTrekSit;
    @FindBy(id = "edit-receiver-408")
    private static WebElement zevendeBijslagTrekSit;
    @FindBy(id = "edit-receiver-409")
    private static WebElement achtsteBijslagTrekSit;
    private static HashMap<String, WebElement> bijslagTrekSitWebMap = new HashMap<>();

    public CalculatorPage() {
        fillBeperkingenMap();
        fillRechtHebSitMap();
        fillBijslagTrekSitMap();
    }

    public static void clickBeginButton() {
        beginButton.click();
    }

    public static void vulNaamVanKind(String naamVanKind) {
        naamVanKindVeld.sendKeys(naamVanKind);
    }

    public static void vulGeboorteDatum(String password) {
        datumVeld.sendKeys(password);
    }

    public static void clickAddChildButton() {
        addChildButton.click();
    }

    public static void clickBeperkingTrueButton() {
        beperkingTrueButton.click();
    }

    public static void clickBeperkingFalseButton() {
        beperkingFalseButton.click();
    }

    public static void clickWeesTrueButton() {
        weesTrueButton.click();
    }

    public static void clickWeesFalseButton() {
        weesFalseButton.click();
    }

    public static void clickWeesOuderInLevenTrue() {
        weesOuderInLevenTrue.click();
    }

    public static void clickWeesOuderInLevenFalse() {
        weesOuderInLevenFalse.click();
    }

    public static void clickWeesOuderHertrouwdTrue() {
        weesOuderHertrouwdTrue.click();
    }

    public static void clickWeesOuderHertrouwdFalse() {
        weesOuderHertrouwdFalse.click();
    }

    public static void clickWeesVerlatenTrue() {
        weesVerlatenTrue.click();
    }

    public static void clickWeesVerlatenFalse() {
        weesVerlatenFalse.click();
    }

    public static void clickSelectRechtHebbendLink() {
        selectRechtHebbendLink.click();
    }

    public static void clickSelectBijslagTrekLink() {
        selectBijslagTrekLink.click();
    }

    private static void fillBeperkingenMap() {
        beperkingWebElementMap.put("minder dan 6 punten en een minimum van 4 punten in P1", eersteBeperking);
        beperkingWebElementMap.put("6 tot 8 punten en minder dan 4 punten in P1", tweedeBeperking);
        beperkingWebElementMap.put("6 tot 8 punten en een minimum van 4 punten in P1", derdeBeperking);
        beperkingWebElementMap.put("9 tot 11 punten en minder dan 4 punten in P1", vierdeBeperking);
        beperkingWebElementMap.put("9 tot 11 punten en een minimum van 4 punten in P1", vijfdeBeperking);
        beperkingWebElementMap.put("12 tot 14 punten", zesdeBeperking);
        beperkingWebElementMap.put("15 tot 17 punten", zevendeBeperking);
        beperkingWebElementMap.put("18 tot 20 punten", achtsteBeperking);
        beperkingWebElementMap.put("meer dan 20 punten", negendeBeperking);
    }

    public static void clickBeperking(String beperkingBeschrijving) {
        beperkingWebElementMap.get(beperkingBeschrijving).click();
    }

    private static void fillRechtHebSitMap() {
        rechtHebSitWebMap.put("Werknemer / zelfstandige", eersteRechtHebSituatie);
        rechtHebSitWebMap.put("Werknemer / zelfstandige met aanvullende werkloosheidsuitkering", tweedeRechtHebSituatie);
        rechtHebSitWebMap.put("Minder dan 6 maanden werkloos", derdeRechtHebSituatie);
        rechtHebSitWebMap.put("Langer dan 6 maanden werkloos / zelfstandige met faillisementsverzekering", vierdeRechtHebSituatie);
        rechtHebSitWebMap.put("Werkloze zonder uitkering, met recht op kinderbijslag", vijfdeRechtHebSituatie);
        rechtHebSitWebMap.put("Als werknemer / zelfstandige minder dan 6 maanden ziek", zesdeRechtHebSituatie);
        rechtHebSitWebMap.put("Als werknemer / zelfstandige langer dan 6 maanden ziek of invalide", zevendeRechtHebSituatie);
        rechtHebSitWebMap.put("Werknemer in loopbaanonderbreking", achtsteRechtHebSituatie);
        rechtHebSitWebMap.put("Gepensioneerd na langer dan 6 maanden ziek of invaliditeit", negendeRechtHebSituatie);
        rechtHebSitWebMap.put("Andere gepensioneerden", tiendeRechtHebSituatie);
        rechtHebSitWebMap.put("Met leefloon (vroeger bestaansminimum)", elfdeRechtHebSituatie);
        rechtHebSitWebMap.put("Student", twaalfdeRechtHebSituatie);
        rechtHebSitWebMap.put("Gehandicapte met recht op kinderbijslag voor zichzelf", dertiendeRechtHebSituatie);
        rechtHebSitWebMap.put("Gehandicapte met recht op kinderbijslag voor andere kinderen", veertiendeRechtHebSituatie);
        rechtHebSitWebMap.put("Rechthebbende overleden", vijftiendeRechtHebSituatie);
    }

    public static void clickRechHebSituatie(String rechtHebSitBeschrijving) {
        rechtHebSitWebMap.get(rechtHebSitBeschrijving).click();
    }

    private static void fillBijslagTrekSitMap() {
        bijslagTrekSitWebMap.put("Alleen met de kinderen - bruto inkomsten per maand lager dan of gelijk aan € 2.452,41", eersteBijslagTrekSit);
        bijslagTrekSitWebMap.put("Alleen met de kinderen - bruto inkomsten per maand hoger dan € 2.452,41", tweedeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Samenwonend met de rechthebbende - bruto inkomsten per maand samen lager dan of gelijk aan € 2.531,55", derdeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Samenwonend met de rechthebbende - bruto inkomsten per maand samen hoger dan € 2.531,55", vierdeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Samenwonend met een andere persoon dan de rechthebbende", vijfdeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Bijslagtrekkende is ook rechthebbende en woont samen met een andere persoon - bruto inkomsten per maand samen lager dan of gelijk aan € 2.531,55", zesdeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Bijslagtrekkende is ook rechthebbende en woont samen met een andere persoon - bruto inkomsten per maand samen hoger dan € 2.531,55", zevendeBijslagTrekSit);
        bijslagTrekSitWebMap.put("Jongere die zelf zijn kinderbijslag ontvangt, buiten het gezin van de rechthebbende", achtsteBijslagTrekSit);
    }

    public static void clickBijslagTrekSituatie(String bijslagTrekSitBeschrijving) {
        bijslagTrekSitWebMap.get(bijslagTrekSitBeschrijving).click();
    }
}