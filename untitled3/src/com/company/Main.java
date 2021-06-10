package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Who is user 1?");
        String us1 = inputScanner.nextLine();

        System.out.println("Who is user 2?");
        String us2 = inputScanner.nextLine();


        boolean ans;
        int steps;
        int steps2;
        int points1 = 0;
        int points2 = 0;
        int sc1 = 0;
        int sc2 = 0;


        do {
            steps = 0;
            steps2 = 0;
            int highnumb1 = 0;
            int highnumb2 = 0;

            System.out.print("Ok, " + us1 + " Enter a Number: ");
            int number = inputScanner.nextInt();
            inputScanner.nextLine();
            System.out.print(us2 + ", Enter a Number:  ");
            int number2 = inputScanner.nextInt();


            while (0 > number || number > 100) {
                System.out.println(us1 + ", you entered too large of a number. Try again?");
                number = inputScanner.nextInt();
            }

            while (0 > number2 || number2 > 100) {
                System.out.println(us2 + ", you entered too large of a number. Try again?");
                number2 = inputScanner.nextInt();
            }


            System.out.println("This is the sequence for: " + us1);
            while (number != 1) {

                if (number % 2 == 0) {
                    System.out.print(number / 2 + ", ");
                    number /= 2;
                } else {
                    System.out.print((number * 3 + 1) + ", ");
                    number = number * 3 + 1;
                }
                steps++;
                highnumb1 = Math.max(number, highnumb1);

                sc1 = +steps;


            }
            System.out.println(us1 + "'s sequence has " + steps + " values.");


            System.out.println("the highest number in this sequence is: " + highnumb1);


            System.out.println("*********\n \n This is the sequence for: " + us2);
            while (number2 != 1) {

                if (number2 % 2 == 0) {
                    System.out.print(number2 / 2 + ", ");
                    number2 /= 2;


                } else {
                    System.out.print((number2 * 3 + 1) + ", ");
                    number2 = number2 * 3 + 1;
                }
                steps2++;


                highnumb2 = Math.max(number2, highnumb2);

                sc2 = +steps2;
            }
            System.out.println(us2 + "'s sequence has " + steps2 + " values.");


            System.out.println("highest number in this sequence is: " + highnumb2);


            if (steps > steps2) {
                points1 = points1 + (steps - steps2);


            } else if (steps2 > steps) {
                points2 = points2 + (steps2 - steps);

            }

            if (highnumb1 > highnumb2) {
                points1 = points1 + 5;

            } else if (highnumb2 > highnumb1) {
                points2 = points2 + 5;

            }


            if (points1 > points2) {
                System.out.println(us1 + " is currently in the lead with " + points1 + " points\n as compared to " + us2 + " with " + points2 + ". \n the difference between them is " + (points1 - points2));
            } else if (points2 > points1) {
                System.out.println(us2 + " is currently in the lead with " + points2 + " points\n as compared to " + us1 + " with " + points1 + ". \n the difference between them is " + (points2 - points1));
            } else {
                System.out.println(us1 +" and "+ us2 + " are tied!\n They both currently have: " + points1 + " points.");
            }


            System.out.println("Do you want to play again?");
            String usa = inputScanner.next();
            usa = usa.toUpperCase();
            char usaCH = usa.charAt(0);
            ans = usaCH == 'Y';
            if (!ans) {

                System.out.println("Do you want to see the results?");
                usa = inputScanner.next();
                usa = usa.toUpperCase();
                usaCH = usa.charAt(0);


                if (usaCH == 'Y') {

                    if (sc1 > sc2) {
                        points1 += sc1 - sc2;
                        ans = false;
                        System.out.print(us1 + " won by " + points1);
                    } else if (sc2 > sc1) {
                        points2 += sc2 - sc1;
                        System.out.print(points2);
                        ans = false;
                    } else {
                        System.out.println("wow! tied!");
                        ans = false;
                    }
                }
            }


        } while (ans);

    }
}