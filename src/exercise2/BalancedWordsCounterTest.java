package exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalancedWordsCounterTest {
    @Test
    public void testCount1() {
        String input = "aabbabcccba";
        int expected = 28;
        assertEquals(expected, BalancedWordsCounter.count(input));
    }
    @Test
    public void testCount2() {
        String input = "";
        int expected = 0;
        assertEquals(expected, BalancedWordsCounter.count(input));
    }
    @Test
    public void testCount3() {
        String input = "abababa1";
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(input),"input contains other characters");
    }
    @Test
    public void testCount4() {
        String input = null;
        assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(input),"input is null");
    }
}
