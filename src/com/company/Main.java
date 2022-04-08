package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Задание 1+2
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == weight.length - 1)
                System.out.println(weight[i]);
            else
                System.out.print(weight[i] + ",");
        }
        System.out.println();
        double[] weight1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i == weight1.length - 1)
                System.out.println(weight1[i]);
            else
                System.out.print(weight1[i] + ",");
        }
        System.out.println();
        byte[] d = new byte[5];
        d[0] = 1;
        d[1] = 3;
        d[2] = 5;
        d[3] = 7;
        d[4] = 9;
        for (int i = 0; i < 5; i++) {
            if (i == d.length - 1)
                System.out.println(d[i]);
            else
                System.out.print(d[i] + ",");
        }
        System.out.println();

        //Задание 3

        Arrays.sort(new int[][]{weight}, Collections.reverseOrder());

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == weight.length - 3)
                System.out.print(weight[i]);
            else
                System.out.print(weight[i] + ",");
        }
        System.out.println();
        for (int i = weight1.length - 1; i >= 0; i--) {
            if (i == weight1.length - 3)
                System.out.print(weight1[i]);
            else
                System.out.print(weight1[i] + ",");
        }
        System.out.println();
        for (int i = d.length - 1; i >= 0; i--) {
            if (i == d.length - 5)
                System.out.print(d[i]);
            else
                System.out.print(d[i] + ",");
        }
        System.out.println();
        // Задание 4
        for (int a = 0; a < weight.length; a++) {
            if (weight[a] % 2 != 0) {
                weight[a]= weight[a]+1;
            } else if (weight[a] % 2 == 0) {
            }
            if (a == weight.length - 1)
                System.out.println(weight[a]);
            else
                System.out.print(weight[a] + ",");

            }
        }
    }

