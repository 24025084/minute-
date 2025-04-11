/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutes.java;

/**
 *
 * @author 24025084
 */
import java.util.Scanner;
public class MinutesConversion {

    public static void main(String[] args) {
        Scanner scanner = new
                    Scanner(System.in);
            System.out.print("enter number of minutes:");
            int minutes = scanner.nextInt();
            double hours = minutes /60.0;
            double days = hours /24.0;
            System.out.print(minutes + "minutes is equals to ");
            System.out.print(hours+"hours");
            System.out.print(days+"days");
    }
}
