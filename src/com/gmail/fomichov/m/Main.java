package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int data[] = new int[checkInt()];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите " + (1 + i) + " элемент массива");
            data[i] = checkInt();
        }


        // выводим массив в консоль
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
