package part3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;


public class Main4 {
    public static void main(String[] args) {
        List<List<Integer>> grid = readInput();
        Integer result;

        if (isValidGrid(grid)) {
            result = diagonalSum(grid);
        } else {
            result = -1;
        }

        System.out.println(result);
    }

    public static Integer diagonalSum(List<List<Integer>> grid) {
        Integer result = 0;
        int size = grid.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    result += grid.get(i).get(j);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size - 1 - i == j) {
                    result += grid.get(i).get(j);
                }
            }
        }

        return result;
    }

    public static boolean isValidGrid(List<List<Integer>> grid) {
        int rows = grid.size();
        for (List<Integer> row : grid) {
            if (row.size() != rows) {
                return false;
            }
        }
        return true;
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}