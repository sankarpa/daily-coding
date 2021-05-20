import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfAllOtherElementsTest {

    ProductOfAllOtherElements elements = new ProductOfAllOtherElements();

    @Test void productOfOtherElements(){
        Integer[] inputOne = {1,2,3,4,5};
        Integer[] expectedOutputOne = {120,60,40,30,24};

        Integer[] inputTwo = {3,2,1};
        Integer[] expectedOutputTwo = {2,3,6};

        assertArrayEquals(expectedOutputOne, elements.productOfAllOtherElements(inputOne));
        assertArrayEquals(expectedOutputTwo, elements.productOfAllOtherElements(inputTwo));
    }
}
