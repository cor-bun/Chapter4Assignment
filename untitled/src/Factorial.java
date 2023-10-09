/** Class: Factorial
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 9, 2023
 * This class requests a number input from the user, then calculates the factorial of that input.
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number greater than one.");
        int number = input.nextInt();

        while(number <= 1) {
            System.out.println("ERROR: Please enter a valid input.");
            number = input.nextInt();
        }
        int output = 1;
        for(int i = 1; i <= number; i++) {
            output = output * i;
        }
        System.out.println("The factorial of " + number + " is " + output + ".");
    }
}
