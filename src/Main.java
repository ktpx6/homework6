public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int q = 10; q >= 1; q = q - 1) {
            System.out.println(q);
        }

        System.out.println("Задача 3");
        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println(w);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int wages = 29000;
        int totalSavings = 0;

        for (int m = 1; m <= 12; m++) {
            totalSavings += wages;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("Задача 9");
        int salaryTwo = 29000;
        int totalTwo = 0;
        for (int i = 2; i <= 12; i++) {
            totalTwo = totalTwo + totalTwo/100;
            totalTwo = totalTwo + salaryTwo;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTwo + " рублей");
        }

        System.out.println("Задача 10");
        for (int i = 2; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}