package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
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



        LocalDate after2019 = LocalDate.of(2019, 2,13);
        LocalDate before2019 = LocalDate.of(2018, 2,13);
        LocalDate olderThan25 = LocalDate.of(1990, 3,23);
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
