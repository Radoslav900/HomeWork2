package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is your favourite brand of car ?");
        Scanner scanner =new Scanner(System.in);
        String favouriteCar = scanner.nextLine();

        System.out.println("My favourite brand of car is " + favouriteCar);

        System.out.println("What car do you own ?");
        String currentCar= scanner.nextLine();

        System.out.println("Are the two cars the same? " + favouriteCar.equals(currentCar));

        System.out.println("Please write a sentence");
        String sentence= scanner.nextLine();
        String[] l = sentence.split(" ");

        System.out.println("The number of words in the above sentence is: " + l.length);

        System.out.println("My favourite car is " + favouriteCar + " and my current car is " + currentCar + " and i wrote the sentence : " + sentence);

    }
}
