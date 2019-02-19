package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, step;
        float y=0;
        byte swap;
        System.out.println("Выберите режим работы: ");
        System.out.println("1) Возведения числа  указанную степень");
        System.out.println("2) Нахождение корня из числа");
        swap = scanner.nextByte();
        if (swap==1) {
            System.out.print("Введите число ");
            a = scanner.nextInt();
            System.out.print("Введите степень возведения ");
            step= scanner.nextInt();
            int b = (int) Math.pow(a, step);
            System.out.println(a + "^" + step + " = " + b);
        }
        if (swap==2){
            System.out.print ("Введите число ");
            y = scanner.nextFloat();
            float x = (float) Math.sqrt(y);
            System.out.print ("√" +y+ " = ");
            System.out.println(x);
        }
    }
}
