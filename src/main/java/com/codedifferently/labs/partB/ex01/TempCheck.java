package com.codedifferently.labs.partB.ex01;

public class TempCheck {

    public static String bool(){
        String response= "";
        int tmp = 90;

        if (tmp <= 45) {
            response = "It's cold - putting on a coat!";
        } else if (tmp >= 46 && tmp <= 65) {
            response = "It's not bad out - a hoodie will do just fine!";
        } else {
            response = "It's hot - a T shirt will be perfect.";
        }
        return response;
    }

    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);

    }
}
