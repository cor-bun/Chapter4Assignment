/** Class: PrimeNumber
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 2, 2023
 */

import java.util.Scanner;
public class PrimeNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = input.nextInt();

        for(int i = 2; i <= number; i++) {
            if(number % i == 0 && i != number) {
                System.out.println(number + " is not a prime number.");
                break;
            } else if (i == number) {
                System.out.println(number + " is a prime number.");
                break;
            }
        }
    }
}
