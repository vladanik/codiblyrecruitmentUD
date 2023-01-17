package exercise1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.testng.AssertJUnit.*;

public class BubbleSortTest {
    @Test
    public void sortTest1() {
        List<Integer> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        assertEquals(expected, BubbleSort.sort(input));
    }
    @Test
    public void sortTest2() {
        List<Double> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Double> expected = Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        assertEquals(expected, BubbleSort.sort(input));
    }
    @Test
    public void sortTest3() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, BubbleSort.sort(input));
    }
    @Test
    public void sortTest4() {
        List<Double> input = Arrays.asList(null, 5.0001);
        List<Double> expected = Arrays.asList(5.0001);
        assertEquals(expected, BubbleSort.sort(input));
    }
    @Test
    public void sortTest5() {
        List<Double> input = null;
        assertEquals(RuntimeException.class, BubbleSort.sort(input));
    }
}
