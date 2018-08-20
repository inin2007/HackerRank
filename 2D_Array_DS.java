package com.company;

import java.util.*;

public class Main {

    // An O(n^2) solution.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] values = new int[6][6];
        int max = Integer.MIN_VALUE;
        int temp;

        for(int i=0; i < 6; i++){
            for(int k=0; k < 6; k++){
                values[i][k] = input.nextInt();
            }
        }

        // [k = 1][k = 2][k = 3] // i = 1
        //        [k = 1]        // i = 2
        // [k = 1][k = 2][k = 3] // i = 3
        // i = rows, k = cols

        for(int i=0; i < 4; i++){
            for(int k=0; k < 4; k++){
                temp = values[i][k] + values[i][k + 1] + values[i][k + 2] // row 1
                + values[i + 1][k + 1] // row 2
                + values[i + 2][k] + values[i + 2][k + 1] + values[i + 2][k + 2]; // row 3
                max = Math.max(temp, max);
        }
    }
        System.out.println(max);
    }
}
