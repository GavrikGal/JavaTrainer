package part1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = false;

        result = isOddList(data);

        System.out.println(result);
    }

    public static boolean isOddList(List<Integer> data) {
        for (Integer i : data) {
            if (i % 2 != 1) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> readInput() {
        List<Integer> data = null;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Gson gson = new Gson();
            data = gson.fromJson(input, new TypeToken<List<Integer>>(){}.getType());
        }
        scanner.close();

        return data;
    }
}
