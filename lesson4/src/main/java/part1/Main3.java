package part1;

import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        int x1, x2, x3;
        String result = "";

        int[] inputValues = readInput();
        x1 = inputValues[0];
        x2 = inputValues[1];
        x3 = inputValues[2];

        int min = min(x1, x2, x3);
        int max = max(x1, x2, x3);

        result = "минимальное: %d, максимальное: %d".formatted(min, max);

        System.out.println(result);
    }

    public static int min(int x1, int x2, int x3) {
        // Через Arrays.stream
        // return Arrays.stream(new int[]{x1, x2, x3}).min().getAsInt();

        // Через Math
        return Math.min(Math.min(x1, x2), x3);
    }

    public static int max(int x1, int x2, int x3) {
        // Через Arrays.stream
        // return Arrays.stream(new int[]{x1, x2, x3}).max().getAsInt();

        // Через Math
        return Math.max(Math.max(x1, x2), x3);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }
}
