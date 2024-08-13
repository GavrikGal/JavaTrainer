package part1;

import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        String[] inputMessages = readInput();
        String message1, message2;
        message1 = inputMessages[0];
        message2 = inputMessages[1];

        String result = message1 + " " + message2;

        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}