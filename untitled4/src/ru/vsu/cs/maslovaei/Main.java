package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value = readValue("Input value: ");
        int max = -1;
        int min = 10;

        countValue(value, max, min);
    }

    private static void countValue(int value, int max, int min) {

        while (value != 0) {

            int tmp = Math.abs(value) % 10;
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
            value /= 10;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    private static int readValue(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}



