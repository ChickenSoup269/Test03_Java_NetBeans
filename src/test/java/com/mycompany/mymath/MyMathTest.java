/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mymath;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien
 */
public class MyMathTest {
    
    public MyMathTest() {
    }

    @Test
    public void testIsEven() {
        int n = 12;
        boolean expResult = false;
        boolean result = MyMath.isEven(n);
        if (expResult == result) {
           System.out.println("Kiểm tra số chẵn: " + n + " không phải là số chẵn.");
        } else {
           System.out.println("Kiểm tra số chẵn: " + n + " là số chẵn.");
        }
    }

    @Test
    public void testFindMax() {
        int a = 18;
        int b = 5;
        int c = 24;
        int expResult = 24;
        int maxNumber = MyMath.findMax(a, b, c);
        assertEquals(expResult, maxNumber);
         System.out.println("Giá trị lớn nhất là: " + maxNumber);
    }

    @Test
    public void testCalculateAverage() {
    
        int a = 10;
        int b = 20;
        int c = 30;
        double expResult = 20.0;
        double avg = MyMath.calculateAverage(a, b, c);
        assertEquals(expResult, avg, 0);
        System.out.println("Trung bình cộng là: " + avg);

    }
    
}
