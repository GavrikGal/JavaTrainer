package part1;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;

        result = (n % 2 == 0) && (n % 6 == 0);

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
