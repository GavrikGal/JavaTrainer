package part1;

import java.util.Scanner;


public class Main11 {
    public static void main(String[] args) {
        int x, y;
        boolean result = false;

        int[] inputValues = readInput();
        x = inputValues[0];
        y = inputValues[1];

        result = x == y;

        System.out.println(result);
    }

    public static int[] readInput() {
        int[] inputValues = new int[2];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            inputValues[0] = Integer.parseInt(values[0]);
            inputValues[1] = Integer.parseInt(values[1]);
        }
        scanner.close();

        return inputValues;
    }
}