package com.bridgelabz.junitTestingPrograms;

public class Util {
    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static double temperatureConversion(double temperature, char unit) {
        double convertedTemperature = 0.0;
        if (unit == 'C') {
            convertedTemperature = (temperature * 9/5) + 32;
        } else if (unit == 'F') {
            convertedTemperature = (temperature - 32) * 5/9;
        }
        return convertedTemperature;
    }

    public static double monthlyPayment(double P, double Y, double R) {
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = (P * r) / (1 - Math.pow(1 + r, -n));
        return payment;
    }

    public static double sqrt(double c) {
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
}

