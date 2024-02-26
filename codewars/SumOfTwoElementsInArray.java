package codewars;
//Write a function that takes an array of numbers (integers for the tests) and a target number.
// It should find two different items in the array that, when added together, give the target value.
// The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
//
// For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
//
//  The input will always be valid (numbers will be an array of length 2 or greater,
//  and all of the items will be numbers; target will always be the sum of two different items from that array).


import java.util.Arrays;

public class SumOfTwoElementsInArray {
    public static void main(String[] args) {
        //two_sum([1, 2, 3], 4) == {0, 2}
        int[] sumOfTargetNum = twoSum(new int[]{1, 2, 3}, 4);
        System.out.println(Arrays.toString(sumOfTargetNum));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] sumOfTargetNum = new int[2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j< numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    sumOfTargetNum[0] = i;
                    sumOfTargetNum[1] = j;
                    break;
                }
            }
        }


        return sumOfTargetNum; // Do your magic!
    }
}
