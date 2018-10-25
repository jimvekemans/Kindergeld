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
    static LocalDate olderThan25 = LocalDate.of(1990, 3,23);
    static LocalDate today = LocalDate.now();
    static LocalDate fiveYearOld = LocalDate.now().minus(Period.ofYears(5));
    static LocalDate tenYearOld = LocalDate.now().minus(Period.ofYears(10));
    static LocalDate fifteenYearOld = LocalDate.now().minus(Period.ofYears(15));
    static LocalDate twentyYearOld = LocalDate.now().minus(Period.ofYears(20));
    static LocalDate twentyFourYearOld = LocalDate.now().minus(Period.ofYears(24));

    static String firstChild = "Kind_1";
    static String secondChild = "Kind_2";
    static String thirdChild = "Kind_3";
    static String fourthChild = "Kind_4";
    static String fifthChild = "Kind_5";
    static String numberInput = "1234567890";
    static String symbolInput = "!@#$%^&*()";

    //beperking
    static boolean beperking;

    static boolean wees;

    static boolean eenOuderInLeven;

    static boolean 







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
