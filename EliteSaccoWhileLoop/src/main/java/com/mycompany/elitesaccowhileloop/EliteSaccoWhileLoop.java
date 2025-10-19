/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elitesaccowhileloop;

/**
 *
 * @author BENJAMIN
 */
import java.util.Scanner;

public class EliteSaccoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double rate = 0.05;

        System.out.print("Enter number of teachers: ");
        int count = scanner.nextInt();
        int i = 1;

        while (i <= count) {
            System.out.println("\nTeacher " + i);
            System.out.print("Enter principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter time period in years: ");
            int time = scanner.nextInt();

            double investmentValue = principal + (principal * rate * time);
            System.out.println("Investment Value after " + time + " years: " + investmentValue);

            i++;
        }
    }
}
   
