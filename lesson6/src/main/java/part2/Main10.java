package part2;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;


public class Main10 {
    public static void main(String[] args) {
        Triple<Integer, String, List<Integer>> input = readInput();
        int size = input.getFirst();
        String position = input.getSecond();
        List<Integer> data = input.getThird();
        String result = fillArray(size, position, data);
        System.out.println(result);
    }

    public static String fillArray(int size, String position, List<Integer> data) {
        if (!isValidPosition(position)) {
            return "Неверная позиция";
        }

        if (!isValidSize(size, data.size())) {
            return "Неверный размер";
        }

        int countOfZero = size - data.size();

        for (int i = 0; i < countOfZero; i++) {
            if (position.equals("left")) {
                data.add(0, 0);
            } else {
                data.add(data.size() , 0);
            }
        }

        return listToString(data);
    }
    
    // Валидируем позицию
    public static boolean isValidPosition(String position) {
        return (position.equals("left") || position.equals("right")); 
    }
    
    // Валидируем размер
    public static boolean isValidSize(int resultSize, int dataSize ) {
        return (resultSize >= dataSize);
    }

    // Преобразуем List в форматированную строку
    public static String listToString(List<?> list) {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static Triple<Integer, String, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int size = Integer.parseInt(values[0]);
        String position = values[1];
        List<Integer> data = new Gson().fromJson(values[2], new com.google.gson.reflect.TypeToken<List<Integer>>() {}.getType());

        return new Triple<>(size, position, data);
    }
}

class Triple<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Triple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}