package part1;

import java.util.Scanner;


public class Main8 {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;

        result = sumOfOdd(n);

        System.out.println(result);
    }

    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}
