/**
 * Given an array of numbers, find the maximum sum of contiguous subarray of the array
 *
 * eg: Input: [34, -50, 42, 14, -5, 86]
 *
 * Output : 137
 */
public class MaximumSubarraySum {

    public Integer maximumSubarraySumBruteForce(Integer[] array){
        Integer maxSum = 0;

        for(Integer i = 0; i< array.length -1 ; i++){
            Integer sum = 0;
            for(int j=i; j<array.length; j++){
                sum = sum + array[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return  maxSum;
    }

    public Integer maximumSubarraySum(Integer[] array){
        Integer maxSum = 0, maxEndingHere = 0;

        for(Integer i=0; i<array.length; i++){
            maxEndingHere = Math.max(array[i], maxEndingHere+array[i]);
            maxSum = Math.max(maxEndingHere, maxSum);
        }
        return maxSum;
    }

    public Integer maximumCircularSubarraySum(Integer[] array){
        Integer maxSum = 0, maxEndingHere = 0, sumOfArray = 0, minSum=0, minEndingHere=0;

        for(Integer i=0; i<array.length;i++){
            sumOfArray+=array[i];
            maxEndingHere = Math.max(array[i], array[i]+maxEndingHere);
            minEndingHere = Math.min(array[i], array[i]+minEndingHere);
            minSum = Math.min(minEndingHere, minSum);
            maxSum = Math.max(maxEndingHere, maxSum);
        }

        return Math.max((sumOfArray-minSum), maxSum);

    }



}
