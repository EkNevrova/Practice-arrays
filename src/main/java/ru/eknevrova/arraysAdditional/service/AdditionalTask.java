package ru.eknevrova.arraysAdditional.service;

import java.util.Arrays;

public class AdditionalTask {
    public void printArray () {
        int[] intArray = new int[4];
        for (int index = 0; index != 4; index++) {
            intArray[index] = (int) (Math.random() * 100 - 50);
        }
        System.out.println("Первичный массив: " + Arrays.toString(intArray));

        for (int ind1 = 0; ind1 < intArray.length-1; ind1++) {
            for (int ind2 = 0; ind2 < intArray.length-1-ind1; ind2++) {
                if (intArray[ind2] > intArray[ind2+1]) {
                    int maxNum = intArray[ind2];
                    intArray[ind2] = intArray[ind2+1];
                    intArray[ind2+1] = maxNum;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(intArray));
    }
}