package com.example.learning;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean appCompleted = false;


        do{
        try {
            System.out.println("Enter the number of dice to roll:");
            int numberOfDice = scanner.nextInt();
            appCompleted = true;
            Random random = new Random();

            for (int i = 0; i < numberOfDice; i++) {
                int randomNumber = random.nextInt(6) + 1;
                System.out.println(display(randomNumber));
            }

        } catch (InputMismatchException e) {
            System.out.println("Thant's not a valid number!.");
            scanner.next(); // Clear the invalid input

        }
    }while (!appCompleted);

    }

    static String display(int value) {
        switch (value) {
            case 1:
                return "---------\n|      |\n|   o  |\n|      |\n---------";
            case 2:
                return "---------\n|o     |\n|      |\n|     o|\n---------";
            case 3:
                return "---------\n|o     |\n|   o  |\n|     o|\n---------";
            case 4:
                return "---------\n|o    o|\n|      |\n|o    o|\n---------";
            case 5:
                return "---------\n|o    o|\n|   o  |\n|o    o|\n---------";
            case 6:
                return "---------\n|o    o|\n|o    o|\n|o    o|\n---------";
            default:
                return "Invalid value";
        }
    }
}