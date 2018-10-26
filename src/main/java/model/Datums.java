package model;

import java.time.LocalDate;
import java.time.Period;

public enum Datums {
    TODAY(dateFactory.today),
    AFTER2019(dateFactory.after2019),
    BEFORE2019(dateFactory.before2019),
    TWENTYFIVE(dateFactory.twentyFive),
    OLDERTHANTWENTYFIVE(dateFactory.olderThanTwentyFive),
    YOUNGERTHANTWENTYFIVE(dateFactory.youngerThanTwentyFive),
    EIGHTEEN(dateFactory.eighteen),
    OLDERTHANEIGHTEEN(dateFactory.olderThanEighteen),
    YOUNGERTHANEIGHTEEN(dateFactory.youngerThanEighteen),
    TWELVE(dateFactory.twelve),
    OLDERTHANTWELVE(dateFactory.olderThanTwelve),
    YOUNGERTHANTWELVE(dateFactory.youngerThanTwelve),
    SIX(dateFactory.six),
    OLDERTHANSIX(dateFactory.olderThanSix),
    YOUNGERTHANSIX(dateFactory.youngerThanSix);

    private final LocalDate localDate;

    Datums(LocalDate date) {
        this.localDate = date;
    }

    public LocalDate getDate() {
        return localDate;
    }

    public String toString() {
        return String.format(
                "%02d/%02d/%04d",
                localDate.getDayOfMonth(),
                localDate.getMonthValue(),
                localDate.getYear()
        );
    }
}

class dateFactory {
    static LocalDate today = LocalDate.now();
    static LocalDate after2019 = LocalDate.of(2019, 1, 1);
    static LocalDate before2019 = LocalDate.of(2018, 12, 31);
    static LocalDate twentyFive = today.minus(Period.ofYears(25));
    static LocalDate olderThanTwentyFive = twentyFive.minus(Period.ofDays(1));
    static LocalDate youngerThanTwentyFive = twentyFive.plus(Period.ofDays(1));
    static LocalDate eighteen = today.minus(Period.ofYears(18));
    static LocalDate olderThanEighteen = eighteen.minus(Period.ofDays(1));
    static LocalDate youngerThanEighteen = eighteen.plus(Period.ofDays(1));
    static LocalDate twelve = today.minus(Period.ofYears(12));
    static LocalDate olderThanTwelve = twelve.minus(Period.ofDays(1));
    static LocalDate youngerThanTwelve = twelve.plus(Period.ofDays(1));
    static LocalDate six = today.minus(Period.ofYears(6));
    static LocalDate olderThanSix = six.minus(Period.ofDays(1));
    static LocalDate youngerThanSix = six.plus(Period.ofDays(1));
}
