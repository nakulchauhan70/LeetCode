package com;

public class ConverttheTemperature {
    public static void main(String[] args) {
        System.out.println(convertTemperature(36.50));
        System.out.println(convertTemperature(122.11));
    }

    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
