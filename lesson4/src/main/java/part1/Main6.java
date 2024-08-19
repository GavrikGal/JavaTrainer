package part1;

import java.util.Scanner;


public class Main6 {
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
            case "left" -> decrease(x);
            case "right" -> increase(x);
            default -> x;
        };
    }

    public static int moveY(int y, String direction) {
        return switch (direction) {
            case "up" -> decrease(y);
            case "down" -> increase(y);
            default -> y;
        };
    }

    public static int increase(int i) {
        return Math.min(++i, 100);
    }

    public static int decrease(int i) {
        return Math.max(--i, 0);
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
