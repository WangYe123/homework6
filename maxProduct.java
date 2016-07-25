public class Solution {
    public int maxProduct(int[] nums) {
        int maxIndex = 1, minIndex = 1;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++){
            int preMax = Math.max(1,maxIndex);
            if (nums[i] > 0){
                maxIndex = preMax * nums[i];
                minIndex *= nums[i];
            }else{
                maxIndex = minIndex * nums[i];
                minIndex = preMax * nums[i];
            }
            result = Math.max (result, maxIndex);
        }
        return result;
    }
}