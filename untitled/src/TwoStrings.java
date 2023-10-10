/** Class: TwoStrings
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class accepts two strings from the user, performs analyses based on length and alphabetical order, then prints
 *      appropriate outputs.
 */

import java.util.Scanner;
public class TwoStrings {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter a string of characters.");
        String stringOne = inputOne.nextLine();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter another string of characters.");
        String stringTwo = inputTwo.nextLine();

        if(stringOne.length() > stringTwo.length()) {
            System.out.println("'" + stringOne + "' is greater in length than '" + stringTwo + "'.");
        }
        else if (stringOne.length() < stringTwo.length()) {
            System.out.println("'" + stringTwo + "' is greater in length than '" + stringOne + "'.");
        }
        else {
            System.out.println("The strings are equal in length.");
        }
        int order = stringOne.compareTo(stringTwo);
        if(order == 0) {
            System.out.println("These strings are the same.");
        }
        else if (order < 0) {
            System.out.println("'" + stringOne + "' comes before '" + stringTwo + "' in alphabetical order.");
        }
        else {
            System.out.println("'" + stringTwo + "' comes before '" + stringOne + "' in alphabetical order.");
        }
    }
}
