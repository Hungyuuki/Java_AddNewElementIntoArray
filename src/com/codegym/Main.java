package com.codegym;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Ruby", "Weiss", "Blake", "Yang"};
        System.out.println("-----Mảng ban đầu-----");
        for (String element : array) {
            System.out.println(element);
        }
        String[] newArray = removeElementFormArray(array, 3);
        System.out.println("----Mảng sau khi bớt----");
        for (String element : newArray) {
            System.out.println(element);
        }
    }

    public static String[] removeElementFormArray(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}
