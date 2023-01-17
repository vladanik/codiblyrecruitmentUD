package exercise2;

import java.util.HashMap;

public class BalancedWordsCounter {
    public static int count(String input) {
        if (input == null) {
            throw new RuntimeException("input is null");
        }
        if (input == "") {
            return 0;
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException("input contains other characters");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String sub = input.substring(i, j + 1);
                if (isBalanced(sub, map)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isBalanced(String input, HashMap<Character, Integer> map) {
        HashMap<Character, Integer> subMap = new HashMap<>(map);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (subMap.containsKey(c)) {
                subMap.put(c, subMap.get(c) - 1);
                if (subMap.get(c) == 0) {
                    subMap.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
