import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumTest {
    MaximumSubarraySum subarraySum = new MaximumSubarraySum();

    @Test
    void maximumSubarraySumBruteForce() {
        Integer[] testArray = {34,-50, 42,14,-5,86};
        Integer[] testArray1 = {-5,-1,-8,-9};

        assertEquals(137, subarraySum.maximumSubarraySumBruteForce(testArray));
        assertEquals(0, subarraySum.maximumSubarraySumBruteForce(testArray1));
    }

    @Test
    void maximumSubarraySum(){
        Integer[] testArray = {34,-50, 42,14,-5,86};
        Integer[] testArray1 = {-5,-1,-8,-9};

        assertEquals(137, subarraySum.maximumSubarraySum(testArray));
        assertEquals(0, subarraySum.maximumSubarraySum(testArray1));
    }

    @Test
    void maximumCircularSubarraySum() {
        Integer[] testArray = {8,-1, 3, 4};
        Integer[] testArray1 = {-5,-1,-8,-9};


        assertEquals(15, subarraySum.maximumCircularSubarraySum(testArray));
        assertEquals(0, subarraySum.maximumCircularSubarraySum(testArray1));
    }
}
