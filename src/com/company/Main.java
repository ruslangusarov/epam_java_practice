package com.company;

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name+"! Let's try to reverse your next type. Type any text:");
        String text = scanner.nextLine();
        char [] txet = text.toCharArray();
        char [] faketxet = new char[txet.length];
        for (int i=txet.length, a=0; i>0; i--, a++) {
            faketxet[a] = txet[i-1];
        }
        System.out.println("Did you mean "+String.valueOf(faketxet)+"? I'm joking, I know you definetely meant that. Now give me a number:");
        int number = scanner.nextInt();
        int [] numbers = new int[number];
        System.out.println("Okay, "+number+" new numbers are generated: ");
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*(1000-10+5))+1;
            System.out.println(numbers[i]);
        }
        System.out.println("I mean seriously, here they are from top to bottom: ");
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Now let's do some calculations! Give me 2 natural numbers and I'll try to add and multiply them!");
        System.out.println("Number a: ");
        int a = scanner.nextInt();
        System.out.println("Number b: ");
        int b = scanner.nextInt();
        if (a>-46341 && a<46341 && b>-46341 && b<46341) {
            System.out.println("So, it was easy. "+a+"+"+b+"="+(a+b)+" and "+a+"*"+b+"="+(a*b));
        } else {
            System.out.println("Your numbers are too big, try something in this bounds: (-46341;46341)!");
        }
        System.out.println("Now let's speak about months. Which month is your favourite? Give me its number: ");
        int month = scanner.nextInt();
        switch(month) {
            case 1: System.out.println("Oh, January! The first of the year, the second of winter! Like this too!"); break;
            case 2: System.out.println("February, wow! The coldest one I suppose, but it is already the end of winter!"); break;
            case 3: System.out.println("March! Spring starts from it and nature revives all around!"); break;
            case 4: System.out.println("Oh, April! But, why though? Because of April's Fools? Or your B-Day is near?"); break;
            case 5: System.out.println("May! Not summer, but almost not spring! Or still spring?..."); break;
            case 6: System.out.println("June! Gotcha! Summer, sun, beaches and... So, you don't study in the Uni, right?"); break;
            case 7: System.out.println("July is the middle of the year and of summer! Definetely understand you, the warmest or even hottest one!"); break;
            case 8: System.out.println("August! Seems very romantic to me... Don't know why, I'm just a machine..."); break;
            case 9: System.out.println("September? Really? So, you're not a student any more, right?"); break;
            case 10: System.out.println("October? Hm-m... Have you ever been to Germany? Do you like beer? Isn't it the reason?"); break;
            case 11: System.out.println("November is this type of month when you can hit the jackpot during the sales, got it!"); break;
            case 12: System.out.println("So, December, as the beginning of winter and the end of the year! Interesting!"); break;
            default: System.out.println("But there are just 12 months in the year... In each year, I suppose... You kidding!"); break;
        }






    }
}
