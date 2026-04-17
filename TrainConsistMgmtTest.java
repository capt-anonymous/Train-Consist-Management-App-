import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TrainConsistMgmtTest {

    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] capacities = {72, 58, 65, 40, 80, 55};
        int[] expected = {40, 55, 58, 65, 72, 80};

        TrainConsistMgmt.bubbleSort(capacities);

        assertArrayEquals(expected, capacities);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] capacities = {10, 20, 30, 40};
        int[] expected = {10, 20, 30, 40};

        TrainConsistMgmt.bubbleSort(capacities);

        assertArrayEquals(expected, capacities);
    }

    @Test
    public void testBubbleSortWithSingleElement() {
        int[] capacities = {50};
        int[] expected = {50};

        TrainConsistMgmt.bubbleSort(capacities);

        assertArrayEquals(expected, capacities);
    }
}
