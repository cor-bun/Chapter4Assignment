/** Class: GradeAverage
 * @author Corbin Hendricks
 * @version 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: October 10, 2023
 * This class requests the number of students, those students' grades, then produces the average grade in the class.
 */

import java.util.Arrays;
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int classSize = inputOne.nextInt();

        System.out.println("Please enter the students' grades.");
        int[] classGrades = new int[classSize];
        int gradesSum = 0;
        for(int i = 0; i < classSize; i++) {
            Scanner inputTwo = new Scanner(System.in);
            classGrades[i] = inputTwo.nextInt();
            gradesSum = gradesSum + classGrades[i];
        }
        System.out.println("Class grades are...");
        System.out.println(Arrays.toString(classGrades));
        System.out.println("Class average is " + gradesSum / classSize + ".");

    }
}
