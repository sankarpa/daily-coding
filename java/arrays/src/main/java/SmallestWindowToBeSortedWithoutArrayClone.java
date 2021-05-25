import java.util.Arrays;

public class SmallestWindowToBeSortedWithoutArrayClone {

    public Integer[] smallestWindowTobeSorted(Integer[] array){
        Integer[] smallestWindow = new Integer[2];
        Integer max = null, min = null;

        for(int i=0; i< array.length; i++){
            if(max == null){
                max = array[i];
            }

            max = Math.max(max,array[i]);
            if(array[i] < max){
                smallestWindow[1] = i;
            }
        }

        for(int i=array.length-1; i>=0; i--){
            if(min == null){
                min = array[i];
            }
            min = Math.min(min, array[i]);
            if(array[i]>min){
                smallestWindow[0] = i;
            }
        }
        return smallestWindow;
    }

}
