/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tests.interviews.ddtest_preg2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String theinput = in.next();
        String[] items = theinput.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] input = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            try {
                input[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            ;
        }
        int[] output = Main.completar(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] completar(int[] input) {
        int mayor = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > mayor) {
                mayor = input[i];
            }
        }
        int[] result = new int[mayor];
        for (int i = 1; i <= mayor; i++) {
            result[i - 1] = i;
        }

        return result;
    }

}
