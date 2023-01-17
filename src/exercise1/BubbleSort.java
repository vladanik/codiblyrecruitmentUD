package exercise1;

import java.util.List;

public class BubbleSort {
    public static <T extends Comparable<T>> List<T> sort(List<T> input) {
        if (input == null) {
            throw new RuntimeException("input is null");
        }
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size() - 1; j++) {
                if (input.get(j) != null && input.get(j + 1) != null &&
                    input.get(j).compareTo(input.get(j + 1)) > 0) {
                    T temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                } else if (input.get(j) == null && input.get(j + 1) != null) {
                    input.remove(j);
                    i--;
                } else if (input.get(j) != null && input.get(j + 1) == null) {
                    input.remove(j + 1);
                    i--;
                }
            }
        }
        return input;
    }
}
