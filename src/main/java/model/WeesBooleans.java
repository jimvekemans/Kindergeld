package model;

public enum WeesBooleans {
    GEEN_WEES(false, false, false, false),
    WEES(true, false, false, false),
    WEES_1_OUDER_OVER(true, true, false, false),
    WEES_OUDER_HERTROUWD(true, true, true, false),
    WEES_KIND_VERLATEN(true, true, true, true);

    boolean first, second, third, fourth;

    WeesBooleans(
            boolean first,
            boolean second,
            boolean third,
            boolean fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    boolean[] getBooleans() {
        return new boolean[]{first, second, third, fourth};
    }

    public String getBooleanWaardes() {
        return (first + ", " + second + ", " + third + ", " + fourth);
    }
}
