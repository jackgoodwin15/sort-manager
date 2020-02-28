package com.sparta.jg;

import java.util.Arrays;

public class BubbleSort implements Sort {
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public int[] sortArray() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(i);
            }
        }

        if (isSorted()) {
            return array;
        } else {
            return sortArray();
        }
    }

    @Override
    public void swap(int index) {
        int number = array[index];
        array[index] = array[index + 1];
        array[index + 1] = number;
    }

    @Override
    public boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String print() {
        return Arrays.toString(array);
    }
}

