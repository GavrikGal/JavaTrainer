package part2;

import com.google.gson.Gson;
import java.util.*;


public class Main11 {
    public static void main(String[] args) {
        Pair<Integer, List<List<Integer>>> input = readInput();
        int k = input.getFirst();
        List<List<Integer>> data = input.getSecond();
        boolean result = findNumber(k, data);
        System.out.println(result);
    }

    public static boolean findNumber(int k, List<List<Integer>> data) {
        return data.stream()
                // "Разворачиваем" двумерный список List<List<Integer>>
                // в одномерный List<Integer>
                .flatMap(List::stream)
                // Найти любое соответствие выражению x == k,
                // т.е. найти искомый елемент
                .anyMatch(x -> x == k);
    }

    public static Pair<Integer, List<List<Integer>>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int k = Integer.parseInt(values[0]);
        List<List<Integer>> data = new Gson().fromJson(values[1], new com.google.gson.reflect.TypeToken<List<List<Integer>>>() {}.getType());

        return new Pair<>(k, data);
    }
}

//class Pair<F, S> {
//    private final F first;
//    private final S second;
//
//    public Pair(F first, S second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public F getFirst() {
//        return first;
//    }
//
//    public S getSecond() {
//        return second;
//    }
//}