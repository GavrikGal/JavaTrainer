package part1;

import java.util.Scanner;


public class Main12 {
    public static void main(String[] args) {
        int role = readInput();
        String result = "";

        result = chooseRole(role);

        System.out.println(result);
    }

    public static String chooseRole(int role) {
        return switch (role) {
            case 1 -> "admin";
            case 2 -> "moderator";
            case 3 -> "user";
            default -> "guest";
        };
    }

    public static int readInput() {
        int role = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            role = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return role;
    }
}