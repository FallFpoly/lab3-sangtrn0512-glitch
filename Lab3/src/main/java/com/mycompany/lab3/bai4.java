/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
    public static String xeploai(double diem){
        if(diem>=9){
            return "xuat sac";
        }else if(diem>=7.5 ){
            return "gioi";
        }else if(diem >=6.5){
            return "kha";
        }else if(diem >=5){
            return "trung binh";
        }else{
            return "yeu";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenSV[];
        double diem[];
        System.out.println("nhap so sv");
        int soSV;
        soSV=sc.nextInt();sc.nextLine();
        tenSV = new String[soSV];
        diem = new double[soSV];
        for(int i=0;i<soSV;i++){
            System.out.println("sv thu "+i);
            System.out.print("nhap ten SV");
            tenSV[i] = sc.nextLine();
            System.out.print("nhap diem ");
            diem[i] = sc.nextDouble();sc.nextLine();
            
            System.out.println("ten " +tenSV[i]);
            System.out.println("diem " +diem[i]);
            System.out.println("hoc luc " +xeploai(diem[i]));
        }
        
        
    }
}
