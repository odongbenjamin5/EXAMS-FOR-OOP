/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradingsystem;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to count how many students got each grade (index 1 to 9)
        int[] gradeCount = new int[10]; // index 0 unused

        int studentCounter = 0;

        while (studentCounter < 5) {
            System.out.print("Enter score for student " + (studentCounter + 1) + " (0–100): ");
            int score = input.nextInt();

            int grade;
            String remark;

            // Determine grade and remark
            if (score >= 80 && score <= 100) {
                grade = 1; remark = "Distinction";
            } else if (score >= 75) {
                grade = 2; remark = "Distinction";
            } else if (score >= 70) {
                grade = 3; remark = "Credit";
            } else if (score >= 65) {
                grade = 4; remark = "Credit";
            } else if (score >= 60) {
                grade = 5; remark = "Credit";
            } else if (score >= 55) {
                grade = 6; remark = "Credit";
            } else if (score >= 50) {
                grade = 7; remark = "Pass";
            } else if (score >= 45) {
                grade = 8; remark = "Pass";
            } else {
                grade = 9; remark = "Fail";
            }

            // Display result
            System.out.println("Score: " + score + " → Grade: " + grade + " (" + remark + ")");
            gradeCount[grade]++;
            studentCounter++;
            System.out.println();
        }

        // Display summary
        System.out.println("📊 Grade Summary for 5 Students:");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCount[i] + " student(s)");
        }

        input.close();
    }
}