//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task2
        System.out.println();
        System.out.println("Task2");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        //Task3
        System.out.println();
        System.out.println("Task3");
        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println(a);
    }

        //Task4
        System.out.println();
        System.out.println("Task4");
        for (int b = 10; b >= -10; b--) {
            System.out.println(b);
        }

        //Task5_1
        System.out.println();
        System.out.println("Task5_1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }

        //Task5_2
        System.out.println();
        System.out.println("Task5_2");
        for (int y = 1904; y <= 2096; y = y + 4) {
            if ((y >= 1904 && (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
                System.out.println(y + " год является високосным");
            } else {
                System.out.println(y + " год - не високосный");
            }
        }

        //Task6
        System.out.println();
        System.out.println("Task6");
        for (int z = 7; z <= 98; z = z + 7) {
            System.out.println(z);
        }

        //Task7
        System.out.println();
        System.out.println("Task7");
        for (int d = 1; d <= 512; d = d * 2) {
            System.out.println(d);
        }

        //Task8
        System.out.println();
        System.out.println("Task8");
        int deposit = 29000;
        int total = 0;
        for (int c = 1; c <= 12; c++) {
            total = total + deposit;
            System.out.println("Месяц " + c + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("За год сумма накоплений будет " + total + " рублей");

        //Task9
        System.out.println();
        System.out.println("Task9");
        float depositForPercent = 29000F;
        float totalForPercent = 0F;
        for (int c = 1; c <= 12; c++) {
            totalForPercent = totalForPercent + totalForPercent/100;
            totalForPercent = totalForPercent + depositForPercent;
            System.out.println("Месяц " + c + ", сумма накоплений равна " + totalForPercent + " рублей");
        }
        System.out.println("За год сумма накоплений будет " + totalForPercent + " рублей");

        //Task10
        System.out.println();
        System.out.println("Task10");
        int firstNumber = 2;
        for (int t = 1; t <= 10; t++) {
            System.out.println(firstNumber + " * " + t + " = " + t * firstNumber);
        }

    }
}
