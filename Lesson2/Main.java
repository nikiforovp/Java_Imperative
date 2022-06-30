package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Integer1. Дано расстояние L в сантиметрах. Используя операцию деления
//        нацело, найти количество полных метров в нем (1 метр = 100 см).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число - кол-во сантиметров: ");
        int L = in.nextInt();
        System.out.println(L/100 + " метров");
        */
//        Integer3. Дан размер файла в байтах. Используя операцию деления нацело,
//        найти количество полных килобайтов, которые занимает данный файл
//                (1 килобайт = 1024 байта).
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число байтов: ");
        int bytes = in.nextInt();
        System.out.println(bytes/1024 + " килобайтов");
        */
//        Integer6. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его
//        правую цифру (единицы). Для нахождения десятков
//        использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от
//        деления.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int number = in.nextInt();
        System.out.println("Десятки " + number / 10);
        System.out.println("Единицы " + number % 10);

         */
        //Integer7. Дано двузначное число. Найти сумму и произведение его цифр.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Дано двухзначное число: ");
        int number = in.nextInt();
        int a = number / 10;
        int b = number % 10;
        System.out.println("Сумма цифр " + (a+b));
        System.out.println("Произведение " + (a*b));*/

        //Integer8. Дано двузначное число. Вывести число, полученное при перестановке цифр
        // исходного числа.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Дано двухзначное число: ");
        int number = in.nextInt();
        int a = number / 10;
        int b=number%10;
        System.out.println("Перевер. число " + (b*10+a));*/
//      Integer9. Дано трехзначное число. Используя одну операцию деления нацело,
//      вывести первую цифру данного числа (сотни).
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Дано трехзначное число: ");
        int number = in.nextInt();
        System.out.println("Сотни " + number / 100);
        */

//        Integer10. Дано трехзначное число. Вывести вначале его последнюю цифру
//        (единицы), а затем — его среднюю цифру (десятки).
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        System.out.println("Единицы: " + number%10);
        int des = (number/10) % 10; // (number%100) / 10;
        System.out.println("Десятки: " + des);*/

        //Integer11. Дано трехзначное число. Найти сумму и произведение его цифр.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int ed = number%10;
        int sot = number/100;
        int des = (number/10)%10;
        System.out.println("Сумма цифр: " + (ed+des+sot));
        System.out.println("Произведение цифр: " + (sot*des*ed));*/

        //Integer12. Дано трехзначное число. Вывести число, полученное при прочтении исходного
        //числа справа налево.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int ed = number%10;
        int sot = number/100;
        int des = (number/10)%10;
        int res = 100*ed + 10*des + sot;
        System.out.println("В обратном порядке " + res);*/
//        Integer13. Дано трехзначное число. В нем зачеркнули первую слева цифру и
//        приписали ее справа. Вывести полученное число.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int sotni = number / 100;
        int ost = number % 100;
        int res = ost*10 + sotni;
        System.out.println("Убрали сотни, приписали сотни слева " + res);

    }
}
