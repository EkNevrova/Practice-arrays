package ru.eknevrova.practiceArrays.service;

import java.util.Arrays;

public class PracticeArrays {
    public int[] createArray() {
        int[] intArray = new int[10];
        for (int index = 0; index != 10; index++) {
            intArray[index] = (int) (Math.random() * 100 - 50);
        }
    return intArray;
    }

    public void printArray (int[] arr) {
        System.out.println("Массив: " + Arrays.toString(arr));
    }

    public void countEvenNumbers (int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                count++;
            }
        }
        System.out.println("1. количество чётных чисел в массиве: " + count);
    }

    public void countOddNumbers (int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (element % 2 != 0) {
                count++;
            }
        }
        System.out.println("2. количество нечётных чисел в массиве: " + count);
    }

    public void countPrimeNumbers (int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (element > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(element); i++) {
                    if (element % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        System.out.println("3. количество простых чисел в массиве: " + count);
    }

    public void summaryNumbers (int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("4. сумма всех чисел в массиве: " + sum);
    }

    public void getDifferenceNumbers (int[] arr) {
        int sumEvenIndex = 0;
        int sumOddIndex = 0;
        for (int index=0; index < arr.length; index++) {
            if (index == 0 || index % 2 == 0) {
                sumEvenIndex += arr[index];
            } else {
                sumOddIndex += arr[index];
            }
        }
        System.out.println("5. разность между суммой чисел имеющих чётный индекс и суммой чисел имеющих нечётный индекс в массиве: " + (sumEvenIndex - sumOddIndex));
    }

    public void countZero (int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (element == 0) {
                count += 1;
            }
        }
        System.out.println("6. количество 0 (сколько раз встречается число \"0\") в массиве: " + count);
    }
}