package part1;

import java.util.Scanner;


public class Main8 {
    public static void main(String[] args) {
        int num = readInput();
        String result = "";

        result = num % 2 == 0 ? "четное" : "нечетное";

        System.out.println(result);
    }

    public static int readInput() {
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            num = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return num;
    }
}