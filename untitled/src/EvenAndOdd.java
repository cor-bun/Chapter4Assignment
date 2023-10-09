/** Class: EvenAndOdd
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 9, 2023
 * This class requests a number input from the user, calculates the product of any odd numbers
 *  between one and itself, and calculates the sum of any even numbers between one and itself.
 */

import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 1000.");
        int number = input.nextInt();

        while (number < 1) {
            System.out.println("ERROR: Please enter a valid input.");
            number = input.nextInt();
        }
        int outputOne = 1;
        for (int i = 1; i <= number; i += 2) {
            outputOne = outputOne * i;
        }
        System.out.println("The product of all odd numbers from 1 to " + number + " is " + outputOne);
        int outputTwo = 0;
        for (int i = 2; i <= number; i += 2) {
            outputTwo = outputTwo + i;
        }
        System.out.println("The sum of all even numbers from 1 to " + number + " is " + outputTwo);
    }
}
