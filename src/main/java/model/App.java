package model;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    private static ArrayList<Datums> datumsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        datumsArrayList.addAll(Arrays.asList(Datums.values()));
    }
}
