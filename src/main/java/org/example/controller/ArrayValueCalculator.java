package org.example.controller;


public class ArrayValueCalculator {

    public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i > arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int value = Integer.parseInt(arr[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}