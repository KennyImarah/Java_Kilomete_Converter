package com.company;

public class SpeedConverter {
    public static long toMilesPerHour(String[] args) {

        public static long toMilesPerHour (double kilometersPerHour){
            if (kilometersPerHour < 0) {
                return -1;
            }
            return Math.round(kilometersPerHour / 1.609);

        }

        public static void printConversion (double kilometersPerHour){
            if (kilometersPerHour < 0) {
                System.out.println("invalid Value");
            } else {
                long milesPerHour = toMilePerHour(kilometersPerHour);
                System.out.println(kilometersPerHour +
                        " km/h = " + milesPerHour + "mi/h");
            }

        }
    }

    private static long toMilePerHour(double kilometersPerHour) {
    }

    public static void toMilesPerHour() {
    }
}