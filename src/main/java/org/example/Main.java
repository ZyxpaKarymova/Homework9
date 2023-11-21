package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int i;
        int[] arr = generateRandomArray();
        int totalMonth = 0;
        for (i = 0; i < arr.length; i++) {
            totalMonth = totalMonth + arr[i];
            // System.out.println( arr[i]);
        }
        System.out.println("Задача 1");
        System.out.println("Сумма трат за месяц " + totalMonth + " рублей.");

        int minArr = 200000;
        int maxArr = -1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
            ;
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Задача 2");
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей.");

        float average;
        totalMonth = 0;
        for (i = 0; i < 30; i++) {
            totalMonth = totalMonth + arr[i];
        }
        average = (float) totalMonth / 30;
        System.out.println("Задача 3");
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Задача 4");
        for (i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}   /*


Задача 4
В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться в обратную сторону.
Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов char[ ]
.
Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
В результате в консоль должно быть выведено: Ivanov Ivan.

Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
Критерии оценки
Для решения задачи не использовали дополнительный массив.
Для решения использовали цикл.
Написанный код выводит в консоль корректные данные.
     */

