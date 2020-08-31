import com.woozfa.algorithm.search.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTests {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test_BinarySearchTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 3;

        assertEquals(2, binarySearch.solution(arr, num));
    }

    @Test
    public void test_BinarySearchTest_low() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 1;

        assertEquals(0, binarySearch.solution(arr, num));
    }


    @Test
    public void test_BinarySearchTest_high() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int num = 8;

        assertEquals(7, binarySearch.solution(arr, num));
    }
}
