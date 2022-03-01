package com.company;

public enum Planet {
    URANUS(30687),
    EARTH(365),
    JUPITER(4333),
    MERCURY(88),
    MARS(687),
    NEPTUNE(60200),
    SATURN(10759),
    VENUS(225);
    int  dayOfAYear;

    Planet(int  dayOfAYear) {
        this.dayOfAYear = dayOfAYear;
    }

    public int getDayOfAYear() {
        return dayOfAYear;
    }


}
