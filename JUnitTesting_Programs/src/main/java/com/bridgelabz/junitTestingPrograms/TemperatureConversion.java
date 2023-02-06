package com.bridgelabz.junitTestingPrograms;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter unit (C for Celsius and F for Fahrenheit): ");
        char unit = sc.next().charAt(0);
        double convertedTemperature = Util.temperatureConversion(temperature, unit);
        System.out.println("Converted temperature: " + convertedTemperature);
    }
}

