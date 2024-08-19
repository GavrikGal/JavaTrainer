package part1;

import java.util.Scanner;


public class Main11 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();

        int n = message.length();

        result.append("*".repeat(n));

        System.out.println(result.toString());
    }

    public static String readInput() {
        String message = "";

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            message = scanner.nextLine();
        }
        scanner.close();

        return message;
    }
}
