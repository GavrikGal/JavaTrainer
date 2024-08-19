package part1;

import java.util.Scanner;


public class Main7 {
    public static void main(String[] args) {
        int n = readInput();
        String result = "";

        result = check(n);

        System.out.println(result);
    }

    public static String check(int n) {
        if (n > 0) {
            return "Число позитивное";
        } else if (n < 0) {
            return "Число негативное";
        }
        return "Число равно 0";
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}
