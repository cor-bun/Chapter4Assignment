/** Class: ReverseString
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class requests a string from the user then prints the reverse of that string.
 */

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter a string of characters.");
        String chars = inputOne.nextLine();
        char[] reverse = new char[chars.length()];

        for(int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(chars.charAt(i));
        }
    }
}
