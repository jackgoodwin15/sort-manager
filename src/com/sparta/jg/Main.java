package com.sparta.jg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;

        System.out.println("Sorting Program");
        System.out.println("----------------");
        System.out.print("How many integers will be in the array? ");
        array = new int[input.nextInt()];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        Sort sorter = new BubbleSort(array);
        System.out.println("Unsorted Array: " + sorter.print());
        sorter.sortArray();
        System.out.println("Sorted Array: " + sorter.print());
    }
}
