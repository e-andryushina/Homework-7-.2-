public class Main {
    public static void main(String[] args) {
        // ДЗ

        //Циклы. Часть 2.  Домашнее задание -1. Задание 1
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 1");
        float deposit = 15000f;
        float total = 0f;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100 + deposit;
            month++;
            System.out.println(String.format("%.2f", total));
        }

        System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", total) + " рублей");

        //Циклы. Часть 2.  Домашнее задание -1. Задание 2
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();


        //Циклы. Часть 2.  Домашнее задание -1. Задание 3
        System.out.println("Циклы. Часть 2.  Домашнее задание -1. Задание 3");
        float population = 12_000_000f;
        float populationIncreaseRate = (float) 17 / 1000;
        float populationDeclineRate = (float) 8 / 1000;
        int i = 0;

        for (; i < 10; i++) {

            population = population + population * populationIncreaseRate - population * populationDeclineRate;

        }

        System.out.println("Год " + i + " , численность населения составляет " + Math.round(population));

        //Циклы. Часть 2.  Домашнее задание -2. Задание 1
        System.out.println("Циклы. Часть 2.  Домашнее задание -2. Задание 1");
        float sum = 15_000;
        float bankRate = 0.07f;
        int c = 0;
        int goal = 12_000_000;

        while (sum <= goal) {
            sum = sum + sum * bankRate;
            c++;
            System.out.println("Месяц " + c + " - сумма накоплений равна - " + String.format("%.2f", sum));
        }
        System.out.println("Для накопления суммы " + goal + " рублей требуется " + c + " месяцев");



        //Циклы. Часть 2.  Домашнее задание -2. Задание 2
        System.out.println("Циклы. Часть 2.  Домашнее задание -2. Задание 2");
        sum = 15_000;
        bankRate = 0.07f;
        c = 0;
        goal = 12_000_000;

        while (sum <= goal) {
            sum = sum + sum * bankRate;
            c++;
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + " - сумма накоплений равна - " + String.format("%.2f", sum));
            }
        }
        System.out.println("Для накопления суммы " + goal + " рублей требуется " + c + " месяцев");


        //Циклы. Часть 2.  Домашнее задание -2. Задание 3
        System.out.println("Циклы. Часть 2.  Домашнее задание -2. Задание 3");
        sum = 15_000;
        bankRate = 0.07f;
        c = 0;
        goal = 12_000_000;

        while (c <= 9 * 12) {
            sum = sum + sum * bankRate;
            c++;
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + " - сумма накоплений равна - " + String.format("%.2f", sum));
            }
        }


        //Циклы. Часть 2.  Домашнее задание -2. Задание 4
        System.out.println("Циклы. Часть 2.  Домашнее задание -2. Задание 4");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
            friday += 7;

        }

        //Циклы. Часть 2.  Домашнее задание -3. Задание 1
        System.out.println("Циклы. Часть 2.  Домашнее задание -3. Задание 1");
        int startingPoint = 1822;
        int finalPoint = 2122;
        int nearEarth = 79;
        for (i=0; i <= finalPoint; i=i + nearEarth) {
            if (i >= startingPoint) {
                System.out.println(i);
            }
        }

        //Циклы. Часть 2.  Домашнее задание -3. Задание 2
        System.out.println("Циклы. Часть 2.  Домашнее задание -3. Задание 2 ");
        int multiplier = 2;
        int result = 0;
        for (i=1; i <= 10;i++) {
            result = i * multiplier;
            System.out.println(multiplier + "*" + i + "=" + result);
        }



    }
}