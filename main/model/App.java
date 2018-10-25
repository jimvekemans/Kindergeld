package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

        stringArrayList.addAll(Arrays.asList(
           firstChild,
           secondChild,
           thirdChild,
           fourthChild,
           fifthChild,
           numberInput,
           symbolInput
        ));


        localDateArrayList.addAll(Arrays.asList(
           after2019,
           before2019,
           today,
           olderThanSix,
           olderThanTwelve,
           olderThanEighteen,
           olderThanTwentyFive,
           youngerThanSix,
           youngerThanTwelve,
           youngerThanEighteen,
           youngerThanTwentyFive,
           six,
           twelve,
           eigteen,
           twentyFive
        ));


    }
}
