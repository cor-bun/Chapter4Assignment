/** Class: CharacterIndex
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class requests a string and a character, then displays the index of the last occurrence of said character
 *      within the string.
 */

import java.util.Arrays;
import java.util.Scanner;
public class CharacterIndex {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String[] entry = new String[]{inputOne.nextLine()};

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter any single letter.");
        String letter = inputTwo.nextLine();

        while(letter.length() > 1 | letter.isEmpty()) {
            System.out.println("ERROR: Please enter a valid input.");
            letter = inputTwo.nextLine();
        }
        int index = -1;
        for(int i = 0; i < entry.length; i++) {
            if(entry[i].equals(letter)) {
                index = i;
            }
        }
        System.out.println("The last occurrence of " + letter + " in string " + Arrays.toString(entry) + " is at index " + index + ".");
    }
}
