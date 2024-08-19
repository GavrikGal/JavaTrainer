package part1;

import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;

        result = power(n);

        System.out.println(result);
    }

    public static int power(int n) {
        // Бредово поставлена задача.
        // Решение получено по подсказакам из комментров
        // и смысла совершенно не несет
        if (n <= 2) {
            return n;
        }

        int count = n / 3;
        int remainder = n % 3;

        if (remainder == 0) {
            return (int) Math.pow(3, count);
        } else if (remainder == 1) {
            count--;
            int result = (int) Math.pow(3, count);
            return result * (3 + remainder);
        } else {
            count--;
            int result = (int) Math.pow(3, count);
            return result * (3 * remainder);
        }
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
