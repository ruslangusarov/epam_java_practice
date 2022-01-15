package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел, которые хотели бы ввести: ");
        int amount = scanner.nextInt();
        int[] number = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println();
            System.out.print("Введите число №" + (i + 1) + " (в пределах значения int): ");
            number[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Введите номер упражнения, которое хотели бы проверить: ");
        int exercise = scanner.nextInt();
        int lowest;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    lowest = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = lowest;
                    sorted = false;
                }
            }
        }
            switch (exercise) {
                case 1:
                    System.out.println("Самое длинное число (наибольшее): "+number[number.length-1]);
                    System.out.println("Самое короткое число (наименьшее): "+number[0]);
                    break;
                case 2:
                    System.out.println("Числа по возрастанию (длины): ");
                    for (int i = 0; i < number.length; i++) {
                        System.out.print(number[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Числа по убыванию (длины): ");
                    for (int i = number.length - 1; i > -1; i--) {
                        System.out.print(number[i] + " ");
                    }
                    break;
                case 3:
                    int line = 1;
                    int midline = 0;
                    int [] numberLine = new int [number.length];
                    for (int i=0; i<number.length; i++) {
                        numberLine[i]=9;
                        while (number[i]>numberLine[i]) {
                            line++;
                            numberLine[i]=(numberLine[i]+1)*10-1;
                            continue;
                        }
                        numberLine[i]=line;
                        midline += line;
                        line=1;
                    }
                    midline /= number.length;
                    System.out.println();
                    System.out.print("Числа, длина которых больше средней длины ("+midline+"): ");
                    for (int i=0; i<number.length; i++) {
                        if (numberLine[i]>midline) {
                            System.out.print(number[i]+" ");
                        }
                    }
                    System.out.println();
                    System.out.print("Числа, длина которых меньше средней длины ("+midline+"): ");
                    for (int i=0; i<number.length; i++) {
                        if (numberLine[i]<midline) {
                            System.out.print(number[i]+" ");
                        }
                    }
                    System.out.println();
                    System.out.print("Числа, длина которых равна средней длине ("+midline+"): ");
                    for (int i=0; i<number.length; i++) {
                        if (numberLine[i]==midline) {
                            System.out.print(number[i]+" ");
                        }
                    }
                    break;
            }
    }
}