package com.company;

public class Main {

    public static void main(String[] args) {
        Planet planet = Planet.EARTH;
        Planet planet1 = Planet.MARS;
        Planet planet2 = Planet.JUPITER;
        Planet planet3 = Planet.MERCURY;
        Planet planet4 = Planet.NEPTUNE;
        Planet planet5 = Planet.SATURN;
        Planet planet6 = Planet.URANUS;
        Planet planet7 = Planet.VENUS;

        Planet[] planets = {planet, planet1, planet2, planet3, planet4, planet5, planet6, planet7};

        Planet min = findAPlanetThatIsLessThanDays(planets);
        Planet max = findAPlanetThatIsMoreThanDays(planets);
        System.out.println("MIN: " + min + "- " + min.getDayOfAYear());
        System.out.println("MAX: " + max + "- " + max.getDayOfAYear());


    }

    public static Planet findAPlanetThatIsLessThanDays(Planet[] planets) {
        Planet minimum = null;
        for (Planet pl : planets) {
            if (minimum == null) {
                minimum = pl;
                continue;
            }
            if (minimum != null) {
                if (minimum.getDayOfAYear() > pl.getDayOfAYear()) {
                    minimum = pl;
                }
            }

        }
        return minimum;


    }

    public static Planet findAPlanetThatIsMoreThanDays(Planet[] planets) {
        Planet maximum = null;
        for (Planet pl : planets) {
            if (maximum == null) {
                maximum = pl;
                continue;
            }
            if (maximum != null) {
                if (maximum.getDayOfAYear() < pl.getDayOfAYear()) {
                    maximum = pl;
                }
            }

        }
        return maximum;

    }
}
