package part1;

import java.util.Scanner;


public class Main7 {
    public static void main(String[] args) {
        int hours = readInput();
        int result = 0;

        result = hours * 60 * 60;

        System.out.println(result);
    }

    public static int readInput() {
        int hours = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            hours = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return hours;
    }
}