package Lesson3;

import java.util.Random;
import java.util.Scanner;

/*
Занятие 3 Логические выражения, логические функции
 */
public class Main {
    public static void main(String[] args) {
        //Boolean1. Дано целое число A. Проверить истинность высказывания:
        // «Число A является положительным»
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean res = a > 0;
        System.out.println(res);*/
        //Boolean. Дано целое число A.
        //Проверить истинность высказывания: «Число A является нечетным».
        /*System.out.print("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean res = a % 2 != 0;
        System.out.println(res);*/
        //Boolean3. Дано целое число A. Проверить истинность высказывания:
        // «Число A является четным».
        /*System.out.print("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean res = a % 2 == 0;
        System.out.println(res);*/
        //Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3».
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a > 2 && b <= 3;
        System.out.println(res);*/
        //Boolean5. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2».
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean res = a >= 0 || b < -2;
        System.out.println(res);*/
        //Boolean6. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Справедливо двойное неравенство A < B < C».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a < b && b < c;
        System.out.println(res);*/
        //Boolean7. Даны три целых числа: A, B, C.
        // Проверить истинность высказывания: «Число B находится между числами A и C».
        // A < B && B < C || C < B && B < A
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a < b && b < c) || (c < b && b < a);
        System.out.println(res);*/
        //Boolean8. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Каждое из чисел A и B нечетное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = a % 2 != 0 && b % 2 !=0;
        System.out.println(res);

         */
        //Boolean9◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Хотя бы одно из чисел A и B нечетное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = a % 2 != 0 || b % 2 !=0;
        System.out.println(res);*/
        //Boolean10. Даны два целых числа: A, B. Проверить истинность высказывания:
        // «Ровно одно из чисел A и B нечетное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0);
        // a % 2 != 0 ^ b % 2 != 0
        System.out.println(res);*/
        //Boolean11. Даны два целых числа: A, B. Проверить истинность высказывания:
        // «Числа A и B имеют одинаковую четность».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a%2)==(b%2);
        System.out.println(res);
        //boolean res = (a % 2 != 0 && b % 2 != 0) || (a % 2 == 0 && b % 2 == 0);
        //System.out.println(res);*/
        //Boolean12. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Каждое из чисел A, B, C положительное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a>0 && b>0 && c>0;
        System.out.println(res);*/
        //Boolean13. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Хотя бы одно из чисел A, B, C положительное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a>0 || b>0 || c>0;
        System.out.println(res);*/
        //Boolean14. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        // «Ровно одно из чисел A, B, C положительное».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        //boolean res = (a > 0 && b < 0 && c < 0) || (a < 0 && b > 0 && c < 0) ||
        //        (a < 0 && b < 0 && c > 0);
        boolean res = a > 0 ^ b >0 ^ c > 0;
        System.out.println(res);*/
        //Boolean15. Даны три целых числа: A, B, C. Проверить истинность высказывания:
        //«Ровно два из чисел A, B, C являются положительными».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a > 0 && b > 0 && c < 0) || (a < 0 && b > 0 && c > 0) ||
                (a > 0 && b < 0 && c > 0);
        System.out.println(res);*/
        //Boolean16. Дано целое положительное число. Проверить истинность высказывания:
        // «Данное число является четным двузначным».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        //четное и двузначное
        boolean res = a % 2 == 0 && a >= 10 && a <= 99;
        System.out.println(res);*/
        //Boolean18. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a == b) || (b == c) || (a == c);
        System.out.println(res);*/
        //Boolean20 Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int sot = a / 100;
        int des = (a / 10) % 10;// (a % 100) /10;
        int ed = a % 10;
        boolean res = (sot != des) && (des != ed) && (sot != ed);
        System.out.println(res);*/
    }
}
