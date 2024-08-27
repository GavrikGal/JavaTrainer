package part2;

import com.google.gson.Gson;
import java.util.*;


public class Main9 {
    public static void main(String[] args) {
        List<Boolean> data = readInput();
        boolean result = allFalse(data);
        System.out.println(result);
    }

    public static boolean allFalse(List<Boolean> data) {
        // Все элементы должны быть false
        // это тоже самое, что ни один не должен быть true
        return data.stream().noneMatch(x -> x);
    }

    public static List<Boolean> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean[] array = new Gson().fromJson(input, boolean[].class);
        List<Boolean> data = new ArrayList<>();
        for (boolean value : array) {
            data.add(value);
        }
        return data;
    }
}