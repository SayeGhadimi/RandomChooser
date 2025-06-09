import java.util.*;

public class RandomChooser {
    public static int getRandom(int start, int end, int... excluded) {
        Random rand = new Random();
        Set<Integer> excludedSet = new HashSet<>();
        for (int num : excluded) {
            excludedSet.add(num);
        }

        int result;
        do {
            result = rand.nextInt(end - start + 1) + start;
        } while (excludedSet.contains(result));

        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            System.out.printf("%4d", getRandom(1, 100, 4, 8, 95, 93));
            if (i % 15 == 0) System.out.println();
        }
    }
}
