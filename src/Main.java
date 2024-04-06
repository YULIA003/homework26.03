public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double sum = 0;
        int month = 0;
        while (sum < 2459000) {
            sum += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + +sum + " рублей");
        }
        System.out.println("Задание 2");
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
            System.out.println();
            for (; n >= 1; n--) {
                System.out.print(n + " ");
            }
            System.out.println();
        System.out.println("Задание 3");
        double population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            double birth = population / 1000 * birthRate;
            double death = population / 1000 * deathRate;
            population = population + birth - death;
            System.out.println("Год " + year + ", численность населения составляет " + (long) population);
        }
        System.out.println("Задание 4");
        double money = 15000;
        int month1 = 1;
        while (money < 12000000) {
            money = money + money * 7 / 100;
            month1++;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + (int) money + " рублей");
        }
        System.out.println("Задание 5");
        double sum1 = 15000;
        int month12 = 1;
        while (sum1 < 12000000) {
            sum1 = sum1 + sum1 * 7 / 100;
            month12++;
            if (month12 % 6 == 0) {
                System.out.println("Месяц " + month12 + ", сумма накоплений равна " + (int) sum1 + " рублей");
            }
        }
        System.out.println("Задание 6");
        double amount = 15000;
        int month2 = 1;
        while (month2 < 108) {
            amount = amount + amount * 7 / 100;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + (int) amount + " рублей");
            }
        }
        System.out.println("Задание 7");
        for (int i = 5; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 8");
        for (int i = 1896; i <= 2100; i = i + 79) {
            System.out.println(i);
        }
    }
}