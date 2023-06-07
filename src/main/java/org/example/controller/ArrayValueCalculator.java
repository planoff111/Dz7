package org.example.controller;


public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException , ArrayDataException{
        int result = 0;
        for (int i = 0; i > arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[0].length != 4) {
                    throw new ArraySizeException("Invalid array size. Expected size: 4x4");
                }
                int value = Integer.parseInt(arr[i][j]);
                result += value;
            }
        }
        return result;
    }
}