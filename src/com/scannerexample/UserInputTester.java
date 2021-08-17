package com.scannerexample;

import java.util.Scanner;

public class UserInputTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");

        String userInput = null;
        try {
            userInput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            scanner.close();
        }
        System.out.println(userInput);
    }
}
