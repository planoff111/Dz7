package org.example;

import org.example.controller.ArrayDataException;
import org.example.controller.ArraySizeException;
import org.example.controller.ArrayValueCalculator;
import org.example.view.View;

public class Main {


    public static void main(String[] args)  {
        View view = new View();


       try{
           int result = ArrayValueCalculator.doCalc(view.getArray());
           System.out.println("Result is " + result);
       }catch (ArraySizeException e){
           System.err.println("Error " +e.getMessage());
       } catch (ArrayDataException ex){
           System.err.println("Error " + ex.getMessage());
       }


    }
}