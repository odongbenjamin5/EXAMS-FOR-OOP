/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singlearray;

/**
 *
 * @author user
 */
public class SingleArray {

    public static void main(String[] args) {
        int[] scores = new int[5]; // Stores scores for 5 students
scores[0] = 85;
scores[1] = 70;
// Access or loop through scores
for (int i = 0; i < scores.length; i++) {
    System.out.println("Student " + (i+1) + " scored: " + scores[i]);
}
    }      
}

