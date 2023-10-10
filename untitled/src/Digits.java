/** Class: GradeAverage
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 9, 2023
 * This class requests an integer from the user then prints the sum of the integer's digits.
 */

import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 999.");
        int number = input.nextInt();

        while(number < 1 | number > 999) {
            System.out.println("ERROR: Please enter a valid input.");
            number = input.nextInt();
        }
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        System.out.println("The sum of the digits of " + number + " is " + sum + ".");
    }
}
