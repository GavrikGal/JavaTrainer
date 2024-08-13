package part1;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        String message = readInput();
        String result = message;

        System.out.println(result);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}