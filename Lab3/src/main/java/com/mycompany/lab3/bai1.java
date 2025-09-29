/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen to ");
        int N = sc.nextInt();
        boolean ok = true;
        for (int i = 2; i < N-1; i++) {
            if(N % i == 0){
                ok = false;
                break;
                
            }
        }
        if(ok==true){
            System.out.println("N la so nguyen to");
        }else{
            System.out.println("N ko phai so nguyen to");
        }
        
    }
}
