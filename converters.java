package com.example.ctofconverter.Utils;

//Fahrenheit = (C*9/5)+32, Celsius = (F-32)*5/9

public class Converters {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = 0.0;
        fahrenheit = (celsius * (9/5.0)) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = 0.0;
        celsius = (fahrenheit - 32) * (5/9.0);
        return celsius;
    }
}
