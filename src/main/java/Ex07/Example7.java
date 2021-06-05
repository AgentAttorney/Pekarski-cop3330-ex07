package Ex07;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example7 {
    public static void main(String[] args)
    {
        System.out.print("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int sq_feet = length*width;
        double conv_factor = 0.09290304;
        double sq_meter = (sq_feet) * (conv_factor);

        System.out.printf("The area is %n" + sq_feet + " square feet%n" + sq_meter + " square meters");

    }
}
