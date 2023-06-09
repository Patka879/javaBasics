package edu.sda.java.basics.trainingTasks;

import java.util.Scanner;

/**
 * Write an application that will take a positive number from the user (type int)
 * and draw a j with a given length and height of 4 lines,
 * according to the following example (fill empty spaces with spaces):
 *
 *   *      **      **
 *    *    *  *    *  *
 *     *  *    *  *    *
 *      **      **
 */
public class Drawing {
    public static void main(String[] args) {
        System.out.println("Enter wave length...;");
        Scanner scanner = new Scanner(System.in);
        int waveLength = scanner.nextInt();

        String[] row1 = new String[]{"*", " "," "," "," "," "," ","*"};
        String[] row2 = new String[]{" ", "*"," "," "," "," ","*"," "};
        String[] row3 = new String[]{" ", " ","*"," "," ","*"," "," "};
        String[] row4 = new String[]{" ", " "," ","*","*"," "," "," "};

        String row1Concat = "";
        String row2Concat = "";
        String row3Concat = "";
        String row4Concat = "";

        int column = 0;

        while (waveLength > 0) {

            row1Concat += row1[column];
            row2Concat += row2[column];
            row3Concat += row3[column];
            row4Concat += row4[column];

            waveLength--;
            column++;

            if(column >= row1.length) {
                column = 0;
            }
        }
        System.out.println(row1Concat);
        System.out.println(row2Concat);
        System.out.println(row3Concat);
        System.out.println(row4Concat);
    }
}
