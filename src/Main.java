public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task3");
        for (int i = 0; i < 17; i += 2) {
            if (i == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.printf("%d год является високосным %n", i);
        }

        System.out.println("Task6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task8");
        int myBudget = 0;
        for (int i = 1; i <= 12; i++) {
            myBudget += 29000;
            System.out.printf("Месяц %d сумма накоплений равна %d рублей %n", i, myBudget);
        }

        System.out.println("Task9");
        double moneyInAccount = 0;
        double percent = 0.01;
        double contribution = 29000;
        for (int i = 1; i <= 12; i++) {
            moneyInAccount = (moneyInAccount + contribution) + moneyInAccount * percent;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей %n", i, moneyInAccount);
        }

        System.out.println("Task10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d %n", i, i * 2);
        }
    }
}