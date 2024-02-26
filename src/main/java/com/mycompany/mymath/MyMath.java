/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mymath;

/**
 *
 * @author TranPhuocThien, TranTuanTho, NguyenKimTin
 * @Team 5 
 */
public class MyMath {

    // Kiểm tra số chẵn
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    
    // Tìm max 3 số nguyên
    public static int findMax(int a, int b, int c){
        int max = (a > b) ? ((a >c ) ? a : c) : ((b > c) ? b : c);
        return max;
    }
    
    // Tìm trung bình cộng 3 số
      public static double calculateAverage(int a, int b, int c) {
        double average = (double) (a + b + c) / 3;
        return average;
    }
}
