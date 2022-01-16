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
        int line;
        int [] numberLine = new int [number.length];
        boolean sorted = false;
            switch (exercise) {

                case 1:
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
                    System.out.println("Самое длинное число (наибольшее): "+number[number.length-1]);
                    System.out.println("Самое короткое число (наименьшее): "+number[0]);
                    break;
                case 2:
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
                    line = 1;
                    int midline = 0;
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

                    /* case 4:
                    int [][] digits = new int [number.length][10];
                    for (int i=0;i<number.length-1;i++) {
                        line = 1;
                        for (int c=0; c<number.length; c++) {
                            numberLine[c]=9;
                            while (number[c]>numberLine[c]) {
                                line++;
                                numberLine[c]=(numberLine[c]+1)*10-1;
                                continue;
                            }
                            numberLine[i]=line;
                            line=1;
                        }
                    }
                    for (int i=0; i<number.length-1; i++) {
                        int ash = number[i];
                        boolean digit = true;
                        int counter = 0;
                        while (digit==true) {
                            digits[i][counter] = ash % 10;
                            ash = (ash - digits[i][counter])/10;
                            counter++;
                            digit=ash!=0?true:false;
                            continue;
                        }
                    }
                    int [] numbers = new int [number.length];
                    for (int i=0; i<number.length-1; i++) {
                        for (int n=1; n<numberLine[i]-1; n++) {
                            numbers[i] = 1;
                            numbers[i] = digits[i][n-1] != digits[i][n] ? numbers[i]++ : numbers[i];
                            }
                        }
                    break; */

                    }

            }
    }