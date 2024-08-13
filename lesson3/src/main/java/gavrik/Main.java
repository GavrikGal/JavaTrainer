package gavrik;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int age = readInput();
        String result = "";

        result = age >= 18 ? "взрослый" : "подросток";

        System.out.println(result);
    }

    public static int readInput() {
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            age = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return age;
    }
}