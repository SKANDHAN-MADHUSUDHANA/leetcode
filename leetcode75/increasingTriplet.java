//leetcode 75
//334. Increasing Triplet Subsequence


/*class Solution {
    public boolean increasingTriplet(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j< nums.length -1; j++){
                if(nums[j]>nums[i]){
                    for(int k = j + 1; k < nums.length; k++){
                        if(nums[k]> nums[j]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
*/


class Solution {
    public boolean increasingTriplet(int[] nums) {
         if(nums == null || nums.length < 3)
            return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n; // smallest so far
            } else if (n <= second) {
                second = n; // second smallest
            } else {
                // Found a number greater than both first and second
                return true;
            }
        }
        return false;
    }
}
