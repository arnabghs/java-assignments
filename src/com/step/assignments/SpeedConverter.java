package com.step.assignments;

public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(printConversion(100));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }
    public static String printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            return ("Invalid Value");
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        return (kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
    }
}
