import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductOfAllOtherElementsWithoutDivision {

    public Integer[] productOfAllOtherElements(Integer[] inputArray){

        Integer[] productOfAllOtherElements = new Integer[inputArray.length];

        List<Integer> prefixProducts = new ArrayList<>();
        List<Integer> suffixProducts = new ArrayList<>();

        for(int i=0; i<inputArray.length;i++){
            if(prefixProducts.size() == 0){
                prefixProducts.add(inputArray[i]);
            }else{
                prefixProducts.add(prefixProducts.get(prefixProducts.size() - 1) * inputArray[i]);
            }

        }


        for(int i=inputArray.length-1; i>=0; i--){
            if(suffixProducts.size() == 0){
                suffixProducts.add(inputArray[i]);
            }else{
                suffixProducts.add(suffixProducts.get(suffixProducts.size() - 1) * inputArray[i]);
            }
        }

        Collections.reverse(suffixProducts);

        for (int i=0; i< inputArray.length; i++){
            if(i==0){
                productOfAllOtherElements[i] = suffixProducts.get(i+1);
            }else if(i== inputArray.length -1){
                productOfAllOtherElements[i] = prefixProducts.get(i-1);
            }else{
                productOfAllOtherElements[i] = prefixProducts.get(i-1) * suffixProducts.get(i+1);
            }

        }
        return productOfAllOtherElements;
    }

}
