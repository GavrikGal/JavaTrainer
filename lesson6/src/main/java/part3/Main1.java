package part3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;


public class Main1 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = deleteZeroValues(data);
        System.out.println(new Gson().toJson(result));
    }

    // Через цикл
    public static List<Integer> deleteZeroValuesInLoop(List<Integer> data) {
        int dataSize = data.size();
        for (int i = 0; i < dataSize; i++) {
            if (data.get(i) == 0) {
                data.remove(i);
                // так как мы выкинули элемент из листа,
                // то надо уменьшить размер проверяемого списка
                dataSize--;
            }
        }
        return data;
    }

    // Через Stream
    public static List<Integer> deleteZeroValues(List<Integer> data) {
        return data.stream()
                .filter(x -> x != 0)
                .toList();
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}