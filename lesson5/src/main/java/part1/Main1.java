package part1;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        int n = readInput();
        int result;

        result = derangements(n);

        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int derangements(int n)
    {
        if (n <= 1) {
            return 0;
        }

        int[] T = new int[n + 1];

        T[1] = 0;
        T[2] = 1;

        for (int i = 3; i <= n; i++) {
            T[i] = (i - 1) * (T[i - 1] + T[i - 2]);
        }

        return T[n];
    }
}
