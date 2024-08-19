package part1;

import java.util.Scanner;


public class Main12 {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;

        result = isPositive(n) ? n * 2 : n;

        System.out.println(result);
    }

    public static boolean isPositive(int n) {
        return n > 0;
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
