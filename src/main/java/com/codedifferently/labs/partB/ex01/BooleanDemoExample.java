package com.codedifferently.labs.partB.ex01;

public class BooleanDemoExample {

    public static String bool(){
        String response= "";

        boolean passed, largeVenue, grade;

        passed = true;
        largeVenue = false;
        grade = passed;

        response += (passed) + "\n";
        response += (largeVenue)+ "\n";
        response += (grade);

        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);
    }
}
