package part1;

import java.util.Scanner;


public class Main9 {
    public static void main(String[] args) {
        int x, y;
        String op;
        int result = 0;

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        op = inputValues[1];
        y = Integer.parseInt(inputValues[2]);

        result = calculate(x, y , op);

        System.out.println(result);
    }

    public static int calculate(int x, int y, String op) {
        return switch (op) {
            case "+" -> x + y;
            case "-" -> x - y;
            default -> 0;
        };
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputValues = input.split(" ");
        }
        scanner.close();

        return inputValues;
    }
}