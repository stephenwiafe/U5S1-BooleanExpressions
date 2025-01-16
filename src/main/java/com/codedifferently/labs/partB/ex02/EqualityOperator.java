package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality(){
        String response = "";
        String num1 = "4";
        String num2 = "5";

        /* Your code goes here*/
        response += "Are "+num1+" and " +num1+" equal? "+ (num1 == num1) + "\n";
        response += "Are "+num1 +" and " +num2 +" equal? "+ (num1 == num2);
        return response;
    }
    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.print(equalityOutput);
    }
}
