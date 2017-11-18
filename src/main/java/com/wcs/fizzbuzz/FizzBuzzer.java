package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String executeOld(int number) {


        if (number % 5 == 0 && number % 3 == 0) {
            return "fizzbuzz";
        } else {
            if (number % 3 == 0) {
                return "fizz";
            } else if (number % 5 == 0) {
                return "buzz";
            } else

                return "" + number;
        }

    }

    public String executeold2(int number) {
        String vissza = "";
        if (number % 3 == 0) {
            vissza += "fizz";
        }
        if (number % 5 == 0) {
            vissza += "buzz";
        }
        if (vissza.isEmpty()) {
            vissza = "" + number;
        }

        return vissza;


    }


    public String execute(int number) {
        StringBuilder vissza = new StringBuilder();
        if (number % 3 == 0) {
            vissza.append("fizz");
        }
        if (number % 5 == 0) {
            vissza.append("buzz");
        }
        if (vissza.length() == 0) {
            vissza.append(number);
        }

        return vissza.toString();


    }

}
