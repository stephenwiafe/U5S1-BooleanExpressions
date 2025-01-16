package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(int num){
        String response = "";

        if (num < 1 || num > 10) {
             System.out.println("Number is out of range: 1-10");
        } else if (num % 2 == 0) {
            System.out.println("The num is even: " + num);
        } else {
            System.out.println("The num is odd: " + num);
        }
        return response;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
        System.out.println(oddEven(num));
    }
}
