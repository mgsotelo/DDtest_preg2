/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tests.interviews.ddtest_preg2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class MainTest {

    public MainTest() {
    }

    /**
     * Test of completar method, of class Main.
     */
    @Test
    public void testCompletar() {
        System.out.println("test del metodo completar");
        int[] input = new int[]{1, 4, 2, 5};
        int[] expResult = new int[]{1, 2, 3, 4, 5};
        int[] result = Main.completar(input);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Arrays.equals(result, expResult)) {
            System.out.println(result);
            System.out.println(expResult);
            fail("Outputs are not the same.");
        }
    }
    
    @Test
    public void testCompletarByMG() {
        String in1 = "[2,1,4,5]";
        String out1 = "[1, 2, 3, 4, 5]";
        testCompletarHelper(in1, out1);
        
        String in2 = "[4,2,9]";
        String out2 = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        testCompletarHelper(in2, out2);
        
        String in3 = "[58,60,55]";
        String out3 = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]";
        testCompletarHelper(in3, out3);
    }

    public void testCompletarHelper(String input, String output) {
        int[] inputFromString = transformStringToIntArray(input);
        int[] outputFromString = transformStringToIntArray(output);
        
        int[] result = Main.completar(inputFromString);
        assertArrayEquals(outputFromString, result);
        if(!Arrays.equals(result, outputFromString)){
            fail("Outputs are not the same.");
        }
        
    }

    private int[] transformStringToIntArray(String input) {
        String[] split = input.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] items = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                items[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return items;
    }

}
