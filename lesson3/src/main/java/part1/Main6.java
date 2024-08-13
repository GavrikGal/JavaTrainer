package part1;

import java.util.Scanner;


public class Main6 {
    public static void main(String[] args) {
        int minutes = readInput();
        int result = 0;

        result = minutes * 60;

        System.out.println(result);
    }

    public static int readInput() {
        int minutes = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            minutes = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return minutes;
    }
}