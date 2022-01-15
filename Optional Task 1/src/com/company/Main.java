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

                /* case 4:
                    int [] same = new int [number.length];
                    int n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
                    for (int i=0;i<number.length-1;i++) {
                        int line = 1;
                        int [] numberLine = new int [number.length];
                        for (int c=0; c<number.length; c++) {
                            numberLine[c]=9;
                            while (number[c]>numberLine[c]) {
                                line++;
                                numberLine[c]=(numberLine[c]+1)*10-1;
                                continue;
                            }
                            numberLine[c]=line;
                            line=1;
                        }
                        for (int c=0;c<number.length;c++) {
                            switch (numberLine[c]) {
                                case 1:
                                    same[c]=numberLine[c];
                                    break;
                                case 2:
                                    n1 = number[c]/10;
                                    n0 = number[c]-n1*10;
                                    same[c]=n0==n1?1:2;
                                    break;
                                case 3:
                                    n2 = number[c]/100;
                                    n1 = (number[c]-n2*100)/10;
                                    n0 = number[c]-(n2*100+n1*10);
                                    same[c]=n2==n1==n0?1:0;
                                    same[c]=same[c]==0&&(n0==n1||n1==n2||n2==n0)?2:3;
                                    break;
                                case 4:
                                    n3 = number[c]/1000;
                                    n2 = (number[c]-n3*1000)/100;
                                    n1 = (number[c]-(n3*1000+n2*100))/10;
                                    n0 = number[c]-(n3*1000+n2*100+n1*10);
                                    same[c]=n3==n2==n1==n0?1:0;
                                    same[c]=same[c]==0&&(n0==n1||n1==n2||n2==) */

                            }
                        }
                    }

            }
    }
}