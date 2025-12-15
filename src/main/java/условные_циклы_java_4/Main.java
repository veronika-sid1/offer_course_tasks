package условные_циклы_java_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isEven();
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
