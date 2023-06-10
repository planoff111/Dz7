package org.example;

import org.example.controller.ArrayDataException;
import org.example.controller.ArraySizeException;
import org.example.controller.ArrayValueCalculator;
import org.example.view.View;

public class Main {


    public static void main(String[] args)  {
        View view = new View();
        String[][] array = {
                {"3", "2", "3", "4"},
                {"5", "1", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
       try{
           int result = ArrayValueCalculator.doCalc(array);
           System.out.println("Result is " + result);
       }catch (ArraySizeException e){
           System.err.println("Error " +e.getMessage());
       } catch (ArrayDataException ex){
           System.err.println("Error " + ex.getMessage());
       }


    }
}