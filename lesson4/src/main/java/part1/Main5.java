package part1;

import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        int x, y;
        String direction, result = "";

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];

        x = moveX(x, direction);
        y = moveY(y, direction);

        result = "x: %d, y: %d, direction: %s".formatted(x, y, direction);

        System.out.println(result);
    }

    public static int moveX(int x, String direction) {
        return switch (direction) {
            case "left" -> x - 1;
            case "right" -> x + 1;
            default -> x;
        };
    }

    public static int moveY(int y, String direction) {
        return switch (direction) {
            case "up" -> y - 1;
            case "down" -> y + 1;
            default -> y;
        };
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }
}
