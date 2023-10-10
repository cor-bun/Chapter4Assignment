/** Class: Pattern
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class prints a pattern of asterisks to the output.
 */

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("At what value would you like the pattern to start?");
        int startValue = input.nextInt();


        for(int i = startValue; i > 0; i--) {
            String repeated = "*";
            String pattern = repeated.repeat(i);
            System.out.println(pattern);
        }
    }
}
