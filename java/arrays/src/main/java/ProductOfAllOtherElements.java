/***
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers
 * in the original array except te one at i
 * eg:
 *      input = [1,2,3,4,5]
 *      output = [120,60,40,30,24]
 */
public class ProductOfAllOtherElements {

    public Integer[] productOfAllOtherElements(Integer[] inputArray){

        Integer[] productOfAllOtherElements = new Integer[inputArray.length];

        Integer product = 1;
        for(int i=0; i< inputArray.length; i++){
            product = product * inputArray[i];
        }

        for(int i=0; i<inputArray.length; i++){
            productOfAllOtherElements[i] = product/inputArray[i];
        }
        return productOfAllOtherElements;
    }

}
