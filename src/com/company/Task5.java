package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой num и ввод с клавиатуры
        System.out.print("Введите число: ");
        int num = in.nextInt();//12321
        in.close();

        //Решение:
        int digit;
        int res = 0;//
        int number = num;//значение заданного числа num  сохраняется в другой целочисленной переменной number для того,
        // чтобы  сравнить значения конечного числа и исходного числа.
        while (num > 0) {
            digit = num % 10;//На каждой итерации последняя цифра числа сохраняется в остатке и записывается в res.
            res = (res * 10) + digit;//записанная предыдущая цифра результата + остаток от деления
            num /= 10;//последняя цифра удаляется из number после деления на 10.
        }
        //сравниваем результат и число. Если равно, то это число Палиндром.
        if (number == res) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
//          //2-й способ с помощью цикла for
//           int res =0;
//           int number = num;
//           for (int digit; num > 0; digit++) {
//             digit = num % 10;
//             res = (res * 10)  + digit;
//             num /= 10;
//           }
//         if ( number == res) {
//             System.out.println("Палиндром");
//         } else {
//             System.out.println("Не палиндром");
//         }
//}
//}
