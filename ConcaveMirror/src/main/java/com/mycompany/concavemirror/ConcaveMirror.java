/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concavemirror;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class ConcaveMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Accept input
        System.out.println("Enter object distance u (in cm) for a concave mirror (use negative value):");
        double u = input.nextDouble();

        System.out.println("Enter image distance v (in cm) for a real image:");
        double v = input.nextDouble();

        // b) Calculate focal length using mirror formula
        double reciprocalF = (1.0 / v) + (1.0 / u);
        double f = 1.0 / reciprocalF;

        // c) Display focal length and check acceptability
        System.out.printf("Calculated focal length: %.2f cm%n", f);

        if (f >= 21.0 && f <= 25.0) {
            System.out.println("✅ Mirror is acceptable (f is within 21.0 cm to 25.0 cm).");
        } else {
            System.out.println("❌ Mirror is NOT acceptable (f is outside the required range).");
        }

        input.close();
    }
}