package part2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Pair<Integer, List<String>> input = readInput();
        int power = input.getFirst();
        List<String> items = input.getSecond();
        int result = increasePower(power, items);
        System.out.println(result);
    }

    public static int increasePower(int power, List<String> items) {
        var health = new Health(power);
        for (String item : items) {
            if (item.equals("Зелье")) {
                health.increaseHealth(10);
            }
        }
        return health.getHealth();
    }

    public static Pair<Integer, List<String>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>(){}.getType();
        List<String> items = gson.fromJson(input.split(" \\| ")[1], listType);
        int power = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(power, items);
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


// Создадим класс Здоровья,
// чтобы было возможно управлять им в стиле ООП
class Health {
    private int health;

    public Health(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void increaseHealth(int potionPower) {
        health += potionPower;
        health = Math.min(health, 100);
    }
}