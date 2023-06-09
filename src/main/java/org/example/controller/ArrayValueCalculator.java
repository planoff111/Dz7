package org.example.controller;


public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException , ArrayDataException{
        int result = 0;
        for (int i = 0; i > arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int value = Integer.parseInt(arr[i][j]);
                result += value;
            }
        }
        return result;
    }
}