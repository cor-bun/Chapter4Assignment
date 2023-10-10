/** Class: GradeAverage
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class requests students' grades in a class, then returns the highest and lowest grades in said class.
 */

import java.util.Arrays;
import java.util.Scanner;
public class HighestLowest {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int classSize = inputOne.nextInt();

        System.out.println("Please enter the students' grades.");
        int[] classGrades = new int[classSize];
        int highest = classGrades[0];
        for(int i = 0; i < classSize; i++) {
            Scanner inputTwo = new Scanner(System.in);
            classGrades[i] = inputTwo.nextInt();
            if(classGrades[i] > highest) {
                highest = classGrades[i];
            }
        }
        int lowest = classGrades[0];
        for(int i = 0; i < classSize; i++) {
            if(classGrades[i] < lowest) {
                lowest = classGrades[i];
            }
        }
        System.out.println("The students grades are...");
        System.out.println(Arrays.toString(classGrades));
        System.out.println("The highest grade is " + highest + ".");
        System.out.println("The lowest grade is " + lowest + ".");
    }
}
