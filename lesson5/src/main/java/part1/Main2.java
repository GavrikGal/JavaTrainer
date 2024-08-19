package part1;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        String result = "";

        result = k > 0 ? stringDegree(message, k) : k < 0 ? stringRoot(message, -k) : "";

        System.out.println(result);
    }

    public static String stringDegree(String message, int degree) {
        return message.repeat(degree);
    }

    public static String stringRoot(String message, int root) {
        if (message.length() % root == 0) {
            return message.substring(0, message.length() / root);
        }
        return "NO SOLUTION";
    }

    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
