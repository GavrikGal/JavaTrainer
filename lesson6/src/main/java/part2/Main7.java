package part2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Pair<Integer, List<String>> input = readInput();
        int power = input.getFirst();
        List<String> items = input.getSecond();
        int result = increasePower(power, items);
        System.out.println(result);
    }

    public static int increasePower(int power, List<String> items) {
        var currentPower = new Power(power);

        // Просматриваем все items и если какие-то из них относятся к бафам,
        // то увеличиваем силу на прибавку от бафа
        for (String item : items) {
            if (Buff.contains(item)) {
                currentPower.increasePower(Buff.get(item).getPower());
            }
        }
        return currentPower.getPower();
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


// Создадим класс Силы,
// чтобы было возможно управлять им в стиле ООП
class Power {
    private int power;

    public Power(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void increasePower(int potionPower) {
        power += potionPower;
        power = Math.min(power, 100);
    }
}

// Создадим класс-перечисление,
// который будет содержать возможные бафы
enum Buff {
    ENERGIZER("Энергетик", 5),
    COFFEE("Кофе", 10);

    private final String name;
    private final int power;

    Buff(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    // будем проверять является ли название item'a бафом
    public static boolean contains(String name) {
        return Arrays.stream(Buff.values())
                .anyMatch(buff -> buff.getName().equals(name));
    }

    // позвращаем объект бафа по его имени
    public static Buff get(String name) {
        return Arrays.stream(Buff.values())
                .filter(buff -> buff.getName().equals(name))
                .findFirst().orElse(null);
    }
}