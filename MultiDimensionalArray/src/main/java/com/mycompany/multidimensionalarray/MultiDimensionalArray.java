/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multidimensionalarray;

/**
 *
 * @author user
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {
    int[][] marks = new int[3][2]; // 3 students, 2 subjects each
marks[0][0] = 80; // Student 1, Subject 1
marks[0][1] = 75; // Student 1, Subject 2
// Loop through the grid
for (int i = 0; i < marks.length; i++) {
    for (int j = 0; j < marks[i].length; j++) {
        System.out.println("Student " + (i+1) + ", Subject " + (j+1) + ": " + marks[i][j]);
    }
}
    }
}
