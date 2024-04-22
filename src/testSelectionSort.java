import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    SelectionSort sorter = new SelectionSort();

    @Test
    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] expected = {2, 7, 8, 9, 10};
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNegative() {
        int[] arr = {-3, -1, -7, -4, -9};
        int[] expected = {-9, -7, -4, -3, -1};
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixed() {
        int[] arr = {3, -2, 0, -1, 2};
        int[] expected = {-2, -1, 0, 2, 3};
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, -2, 5, -2, 0};
        int[] expected = {-2, -2, 0, 5, 5};
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, arr);
    }
}
