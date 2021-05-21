import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {
    @Test
    void bubbleSort1(){
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] actual = BubbleSort.bubbleSort(input, input.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void bubbleSort2(){
        int[] expected = {1};
        int[] input = {1};
        int[] actual = BubbleSort.bubbleSort(input, input.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void bubbleSort3(){
        int[] expected = {};
        int[] input = {};
        int[] actual = BubbleSort.bubbleSort(input, input.length);
        assertArrayEquals(expected, actual);
    }
}