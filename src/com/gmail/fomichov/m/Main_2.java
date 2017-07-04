package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
//        int data[] = new int[checkInt()];
//        for (int i = 0; i < data.length; i++) {
//            System.out.println("Введите " + (1 + i) + " элемент массива");
//            data[i] = checkInt();
//        }

        int data[] = {10, 55, 2, 1, 5, 6, 8, 9, 5, 7, 1, 5, 5, 5, 2, 1, 5, 8};

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
        System.out.println("В массиве обнаружено " + find5 + " поторений числа 5");


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
}
