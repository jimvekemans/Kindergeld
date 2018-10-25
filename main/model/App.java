package model;

import java.time.LocalDateTime;
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

        LocalDateTime after2019;
        LocalDateTime before2019;
        LocalDateTime olderThan25;
        LocalDateTime today;
        LocalDateTime fiveYearOld;
        LocalDateTime tenYearOld;
        LocalDateTime fifteenYearOld;
        LocalDateTime twentyYearOld;
        LocalDateTime twentyFourYearOld;
    }
}
