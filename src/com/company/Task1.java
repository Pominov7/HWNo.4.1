package com.company;

public class Task1 {
    public static void main(String[] args) {
        //Объявляем переменные
        int n1 = 0;
        int n2 = 1;
        int s;
        //выводим первые два числа 0 и 1
        System.out.print(n1 + " " + n2 + " ");
        //2.Решение с помощью цикла for
        for (int i = 0; i < 34; i++) {
            s = n1 + n2;
            n1 = n2;
            n2 = s;
            System.out.print(s + " ");
        }
    }
}
//        2-й способ с помощью цикла while
//        int n1 = 0;
//        int n2 = 1;
//        int s = 0;
//        System.out.print(n1 + " " + n2 + " ");
//        while (s <= 9000000) {
//            s = n1 + n2;
//            n1 = n2;
//            n2 = s;
//            System.out.print(s + " ");
//        }
//    }
//}
