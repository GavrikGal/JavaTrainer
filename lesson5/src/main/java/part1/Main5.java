package part1;

import java.util.*;
import java.util.stream.Stream;


public class Main5 {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;

        result = hasBrakePoint(toIntArray(n));

        System.out.println(result);
    }

    // Перевод числа в массив цифр с помощью стрима
    public static int[] toIntArray(int n) {
        String num = Integer.toString(n);
        return Stream.of(num.split(""))
                .mapToInt(Integer::parseInt).toArray();
    }

    // поиск брэйк-пойнта
    public static boolean hasBrakePoint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = 0;
            for (int l = 0; l <= i; l++) {
                left += array[l];
            }
            for (int r =  i + 1; r < array.length; r++) {
                right += array[r];
            }
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}