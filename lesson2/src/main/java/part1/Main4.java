package part1;

import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        String[] inputValues = readInput();
        String message = inputValues[0];
        int score = Integer.parseInt(inputValues[1]);

        String result = message + " " + (score * 2);

        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}