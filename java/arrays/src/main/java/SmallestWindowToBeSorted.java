import java.util.Arrays;

/**
 * Given an array of integers that are out of order, determine the bounds of the smallest window that must be sorted
 * in order for the entire array to be sorted.
 *
 * Eg:  Input: [3,7,5,6,9]
 *      Output: (1,3)
 */
public class SmallestWindowToBeSorted {

    public Integer[] smallestWindowTobeSorted(Integer[] array){
        Integer[] smallestWindow = new Integer[2];

        Integer[] originalArray = array.clone();
        Arrays.sort(array);

        for(int i=0; i<array.length;i++){
            if(smallestWindow[0] == null && originalArray[i] != array[i]){
                smallestWindow[0] = i;
            }else if(originalArray[i] != array[i]){
                smallestWindow[1] = i;
            }
        }

        return smallestWindow;
    }
}
