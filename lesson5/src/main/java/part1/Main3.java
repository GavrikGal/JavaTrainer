package part1;

import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Triple<Integer, Integer, Integer> triple = readInput();
        int n = triple.getFirst();
        int m = triple.getSecond();
        int k = triple.getThird();
        int result = 0;

        result = fight(n, m, k);

        System.out.println(result);
    }

    public static int fight(int cuttingHeads, int heads, int growingHeads) {
        // Если голов вырастает больше чем рубит меч,
        // но все головы можно срубить за один удар,
        // то ударов будет, соответственно, один.
        // Иначе они будут отрастать быстрее чем их можно срубить
        if (growingHeads >= cuttingHeads) {
            if (cuttingHeads >= heads) {
                return 1;
            } else {
                return -1;
            }
        }

        // Если голов вырастает меньше чем рубит меч,
        // то считаем как растут и рубятся головы
        int count = 0;
        while (heads > 0) {
            // рубим головы
            heads -= cuttingHeads;
            count++;

            // причемся за щит
            // дракон атакует огненным дыханием

            // дракон восстанавливает головы,
            // если он живой
            if (heads > 0) {
                heads += growingHeads;
            }
        }

        return count;
    }

    public static Triple<Integer, Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        return new Triple<>(n, m, k);
    }
}

class Triple<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}
