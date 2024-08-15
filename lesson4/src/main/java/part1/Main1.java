package part1;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;

        System.out.println(result);
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
