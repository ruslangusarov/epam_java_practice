package com.company;

import java.util.Scanner;
import java.lang.*;

public class OptionalTask1 {
    public static void optionalTask1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел, которые хотели бы ввести: ");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println();
            System.out.print("Введите число №" + i + ": ");
            int[] number = new int[amount];
            number[i] = scanner.nextInt();
            System.out.println();
        }
    }
}
