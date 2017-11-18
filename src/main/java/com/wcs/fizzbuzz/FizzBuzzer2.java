package com.wcs.fizzbuzz;

public class FizzBuzzer2 {

    public String execute(int number) {
        StringBuilder vissza = new StringBuilder();
        String szam = ""+ number;
        if (number % 3 == 0 || szam.indexOf('3')>=0) {
            vissza.append("fizz");
        }
        if (number % 5 == 0 || szam.indexOf('5')>=0) {
            vissza.append("buzz");
        }
        if (vissza.length() == 0) {
            vissza.append(number);
        }

        return vissza.toString();


    }

}
