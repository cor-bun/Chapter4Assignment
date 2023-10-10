/** Class: CharacterIndex
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class requests a string and a character, then displays the index of the last occurrence of said character
 *      within the string.
 */

import java.util.Scanner;
public class CharacterIndex {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String entry = inputOne.nextLine();

        int index = entry.length() - 1;
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter a character.");
        String letter = inputTwo.nextLine();
        char check = letter.charAt(0);

        int output = -1;
        for(int i = 0; i <= index; i++) {
            if(check == entry.charAt(i)) {
                output = i;
            }
        }
        System.out.println("Character " + check + " last occurs at index " + output + ".");
    }
}
