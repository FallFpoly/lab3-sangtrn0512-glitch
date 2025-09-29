/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println(" ");
            }
            
        }
    }
}
