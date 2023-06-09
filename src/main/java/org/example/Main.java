package org.example;

import org.example.controller.ArrayDataException;
import org.example.controller.ArraySizeException;
import org.example.controller.ArrayValueCalculator;
import org.example.view.View;

public class Main {


    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        String[][] array = new String[5][5];
        View view = new View();
        ArrayValueCalculator arr = new ArrayValueCalculator();

          arr.doCalc(array);


    }
}