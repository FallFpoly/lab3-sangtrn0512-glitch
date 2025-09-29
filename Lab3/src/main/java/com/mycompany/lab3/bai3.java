/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mang[] ;
        int sl;
        System.out.println("nhap sl phan tu mang");
        sl = sc.nextInt();
        mang = new int[sl];
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < sl; i++) {
            mang[i] = sc.nextInt();
        }
        System.out.printf("mang cua ban la : " );
        for (int i = 0; i < sl; i++) {
            System.out.printf(mang[i] + " ");
            
            
        }
        Arrays.sort(mang);
        System.out.printf("mang sau khi da sap xep");
        for (int i = 0; i < sl; i++) {
            System.out.printf(mang[i]+" ");
        }
        System.out.println("so nho nhat trong mang la :"+mang[0]);
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < sl; i++) {
            if(mang[i]%3==0){
                tong = tong + mang[i];
                dem++;
            }
        }
        int TBC = tong/dem;
        System.out.printf("TBC cua mang la : "+TBC);
        
    }
}
