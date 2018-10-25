package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    static ArrayList<LocalDate> localDateArrayList = new ArrayList<>();
    static ArrayList<String> stringArrayList = new ArrayList<>();

    static LocalDate after2019 = LocalDate.of(2019, 2,13);
    static LocalDate before2019 = LocalDate.of(2018, 2,13);
    static LocalDate olderThanTwentyFive = LocalDate.now().minus(Period.ofYears(25)).minus(Period.ofDays(1));
    static LocalDate twentyFive = LocalDate.now().minus(Period.ofYears(25));
    static LocalDate youngerThanTwentyFive = LocalDate.now().minus(Period.ofYears(25)).plus(Period.ofDays(1));
    static LocalDate olderThanSix = LocalDate.now().minus(Period.ofYears(6)).minus(Period.ofDays(1));
    static LocalDate six = LocalDate.now().minus(Period.ofYears(6));
    static LocalDate youngerThanSix = LocalDate.now().minus(Period.ofYears(6)).plus(Period.ofDays(1));
    static LocalDate olderThanTwelve = LocalDate.now().minus(Period.ofYears(12)).minus(Period.ofDays(1));
    static LocalDate twelve = LocalDate.now().minus(Period.ofYears(12));
    static LocalDate youngerThanTwelve = LocalDate.now().minus(Period.ofYears(12)).plus(Period.ofDays(1));
    static LocalDate olderThanEighteen = LocalDate.now().minus(Period.ofYears(18)).minus(Period.ofDays(1));
    static LocalDate eigteen = LocalDate.now().minus(Period.ofYears(18));
    static LocalDate youngerThanEighteen = LocalDate.now().minus(Period.ofYears(18)).plus(Period.ofDays(1));
    static LocalDate today = LocalDate.now();


    static String firstChild = "Kind_1";
    static String secondChild = "Kind_2";
    static String thirdChild = "Kind_3";
    static String fourthChild = "Kind_4";
    static String fifthChild = "Kind_5";
    static String numberInput = "1234567890";
    static String symbolInput = "!@#$%^&*()";


    static boolean beperking;

    static boolean wees;

    static boolean eenOuderInLeven;

    static boolean ouderHertrouwdOfSamenwonend;

    static boolean kindVerlaten;


    public static void main(String[] args) {
        String firstChild = "Kind_1";
        String secondChild = "Kind_2";
        String thirdChild = "Kind_3";
        String fourthChild = "Kind_4";
        String fifthChild = "Kind_5";
        String numberInput = "1234567890";
        String symbolInput = "!@#$%^&*()";
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.addAll(Arrays.asList(
           firstChild,
           secondChild,
           thirdChild,
           fourthChild,
           fifthChild,
           numberInput,
           symbolInput
        ));


        LocalDate after2019 = LocalDate.of(2019, 2, 13);
        LocalDate before2019 = LocalDate.of(2018, 2, 13);
        LocalDate olderThan25 = LocalDate.of(1990, 3, 23);
        LocalDate today = LocalDate.now();
        LocalDate fiveYearOld = LocalDate.now().minus(Period.ofYears(5));
        LocalDate tenYearOld = LocalDate.now().minus(Period.ofYears(10));
        LocalDate fifteenYearOld = LocalDate.now().minus(Period.ofYears(15));
        LocalDate twentyYearOld = LocalDate.now().minus(Period.ofYears(20));
        LocalDate twentyFourYearOld = LocalDate.now().minus(Period.ofYears(24));


        ArrayList<LocalDate> localDateArrayList = new ArrayList<>();

        localDateArrayList.addAll(Arrays.asList(
           after2019,
           before2019,
                olderThan25,
           today,
                fiveYearOld,
                tenYearOld,
                fifteenYearOld,
                twentyYearOld,
                twentyFourYearOld
        ));
    }
}
