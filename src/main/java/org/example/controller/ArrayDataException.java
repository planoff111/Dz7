package org.example.controller;

public class ArrayDataException extends Exception{

        public ArrayDataException(int row, int column) {
            super("Невірні дані у комірці [" + row + "][" + column + "]");
    }
}
