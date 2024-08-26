package part1;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


public class Main5 {
    public static void main(String[] args) {
        List<String> data = readInput();
        String result;

        data = reverse(data);
        result = toString(data);

        System.out.println(result);
    }

    // изменяем порядок следования элементов коллекции на обратный
    public static List<String> reverse(List<String> data) {
        Collections.reverse(data);
        return data;
    }

    // соединяем элементы коллекции через разделитель ", "
    public static String toString(List<String> data) {
        return String.join(", ", data);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}
