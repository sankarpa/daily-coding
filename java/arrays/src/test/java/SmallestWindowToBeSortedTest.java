import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestWindowToBeSortedTest {

    SmallestWindowToBeSorted smallestWindowToBeSorted = new SmallestWindowToBeSorted();

    @Test
    void  smallestWindowTobeSorted(){
        Integer[] arrayOne = new Integer[]{3,7,5,6,9};
        Integer[] sortWindowOne = new Integer[]{1,3};

        Integer[] arrayTwo = new Integer[]{3,7,5,6,9,10,11,12,12,13,4,5,6,8};
        Integer[] sortWindowTwo = new Integer[]{1,13};

        assertArrayEquals(sortWindowOne, smallestWindowToBeSorted.smallestWindowTobeSorted(arrayOne));
        assertArrayEquals(sortWindowTwo, smallestWindowToBeSorted.smallestWindowTobeSorted(arrayTwo));
    }

}
