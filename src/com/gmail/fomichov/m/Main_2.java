package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int data[] = new int[checkInt()];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите " + (1 + i) + " элемент массива");
            data[i] = checkInt();
        }

        // ищем максимальное и минимальное значение
        int maxValue = data[0];
        int minValue = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }
            if (data[i] < minValue) {
                minValue = data[i];
            }
        }
        System.out.println("Максимальное значение " + maxValue);
        System.out.println("Минимальное значение " + minValue);

        // посчитать кол-во повторений числа 5 и вывести в консоль
        int find5 = 0;
        for (int value : data) {
            if (value == 5) {
                find5++;
            }
        }
        System.out.println("В массиве обнаружено " + find5 + " повторений числа 5");

        // вывести в консоль отсортированный массив
        //Arrays.sort(data);
        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int t = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(data));

        // вывести в консоль максимальное кол-во повторений чисел в массиве
        int tempData[] = new int[data.length];
        int maxTempValue = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    maxTempValue++;
                }
            }
            tempData[i] = maxTempValue;
            maxTempValue = 0;
        }
        findMax(tempData);
    }

    // проверяем на целое число
    private static int checkInt() {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Только целое число!");
                sc.nextLine();
            }
        }
        return value;
    }

    // ищем максимальное значение
    private static void findMax(int[] tempData) {
        int maxValue = tempData[0];
        for (int i = 0; i < tempData.length; i++) {
            if (tempData[i] > maxValue) {
                maxValue= tempData[i];
            }
        }
        System.out.println("Максимальное кол-во повторений чисел в массиве " + maxValue);
    }
}
