package org.example.view;

import java.util.Scanner;

public class View {


    public String[][] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows");
        int rows = sc.nextInt();
        System.out.println("Enter a columns");
        int columns = sc.nextInt();

        String[][] arr = new String[rows][columns];
        System.out.println("Enter a array elements");


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.next();
                System.out.println("Element [" + i + "][" + j + "]: ");
            }
        }

        System.out.println("Your array");

        return arr;

    }

}